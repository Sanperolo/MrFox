package com.housecloud.mrfox;

import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.widget.Button;
import android.widget.EditText;

/**
 * @author sanperolo
 */

public class ExampleInstrumentedTest extends ActivityInstrumentationTestCase2<Login> {

    private Button mloginbutton;
    private EditText etext1;
    private EditText etext2;
    private Login actividad;

    public ExampleInstrumentedTest() {
        super(Login.class);
    }

    protected void setUp() throws Exception {
        super.setUp();
        actividad = getActivity();
        etext1 = actividad.findViewById(R.id.email);
        etext2 = actividad.findViewById(R.id.pass);
        mloginbutton = actividad.findViewById(R.id.loginbutton);
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    private static final String USERNAME = "housecloud";
    private static final String PASSWORD = "123456";

    public void testLoginSignup() {
        TouchUtils.tapView(this, etext1);
        getInstrumentation().sendStringSync(USERNAME);

        TouchUtils.tapView(this, etext2);
        getInstrumentation().sendStringSync(PASSWORD);

        TouchUtils.clickView(this, mloginbutton);

    }


}