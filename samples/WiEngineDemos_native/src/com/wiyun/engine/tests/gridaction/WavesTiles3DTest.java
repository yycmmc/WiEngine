package com.wiyun.engine.tests.gridaction;

import com.wiyun.engine.WiEngineTestActivity;

public class WavesTiles3DTest extends WiEngineTestActivity {
	private native void nativeStart();

	@Override
	protected void runDemo() {
		nativeStart();
	}
}

