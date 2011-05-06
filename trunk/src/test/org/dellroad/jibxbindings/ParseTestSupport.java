
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 *
 * $Id$
 */

package org.dellroad.jibxbindings;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.net.URL;
import java.util.ArrayList;

import org.jibx.runtime.BindingDirectory;
import org.jibx.runtime.IBindingFactory;
import org.jibx.runtime.IMarshallingContext;
import org.jibx.runtime.IUnmarshallingContext;
import org.jibx.runtime.JiBXException;
import static org.testng.Assert.assertEquals;

/**
 * Support superclass for tests that parse XML expecting it to be valid or invalid.
 * The subclass provides the test name, and this class finds all XML files in the
 * same package named FOO-N.xml where FOO is some given label and N = 0, 1, 2, ....
 */
public abstract class ParseTestSupport extends TestSupport {

    /**
     * Parse the document expecting the parse to succeed. If it does, also unparse the document.
     */
    protected <T> void testValidParse(URL url, Class<T> clazz) throws Exception {

        // Parse it
        T t1 = this.parse(url, clazz);

        // Unparse it
        String xml1 = this.unparse(t1);
        System.out.println(xml1);

        // Parse it again
        T t2 = this.parse(xml1, clazz);

        // Unparse it again
        String xml2 = this.unparse(t2);

        // Compare
        assertEquals(xml1, xml2);
    }

    /**
     * Parse the document expecting the parse to fail.
     */
    protected <T> void testInvalidParse(URL url, Class<T> clazz) throws Exception {
        try {
            this.parse(url, clazz);
        } catch (JiBXException e) {
            return;
        }
        assert false : "invalid input successfully parsed: " + url;
    }

    /**
     * Parse the document expecting an instance of {@code clazz} and return the parsed object.
     */
    protected <T> T parse(URL url, Class<T> clazz) throws IOException, JiBXException {
        return parse(url.openStream(), clazz);
    }

    /**
     * Parse the document expecting an instance of {@code clazz} and return the parsed object.
     */
    protected <T> T parse(String s, Class<T> clazz) throws IOException, JiBXException {
        return parse(new ByteArrayInputStream(s.getBytes("UTF-8")), clazz);
    }

    /**
     * Parse the document expecting an instance of {@code clazz} and return the parsed object.
     */
    protected <T> T parse(InputStream input, Class<T> clazz) throws IOException, JiBXException {
        IBindingFactory bindingFactory = BindingDirectory.getFactory(clazz);
        IUnmarshallingContext unmarshallingContext = bindingFactory.createUnmarshallingContext();
        Object obj;
        try {
            obj = unmarshallingContext.unmarshalDocument(input, null);
        } finally {
            input.close();
        }
        assert obj != null : "unmarshalled null object";
        T t = null;
        try {
            t = clazz.cast(obj);
        } catch (ClassCastException e) {
            assert false : "parse expected a " + clazz.getName() + " but got a " + obj.getClass().getName();
        }
        return t;
    }

    /**
     * Unparse the object.
     */
    protected String unparse(Object obj) throws IOException, JiBXException {
        IBindingFactory bindingFactory = BindingDirectory.getFactory(obj.getClass());
        IMarshallingContext mctx = bindingFactory.createMarshallingContext();
        mctx.setIndent(4, "\n", ' ');
        StringWriter writer = new StringWriter();
        mctx.marshalDocument(obj, "UTF-8", null, writer);
        return writer.toString();
    }

    /**
     * Generate parse test cases based on the given label(s).
     * If the label is FOO, we look for FOO-0.xml, FOO-1.xml, etc.
     */
    protected Object[][] genCases(String... labels) throws IOException {
        ArrayList<Object[]> list = new ArrayList<Object[]>();
        for (String label : labels) {
            for (int index = 0; true; index++) {
                URL url = getClass().getResource(label + "-" + index + ".xml");
                if (url == null)
                    break;
                list.add(new Object[] { url });
            }
        }
        return list.toArray(new Object[list.size()][]);
    }
}

