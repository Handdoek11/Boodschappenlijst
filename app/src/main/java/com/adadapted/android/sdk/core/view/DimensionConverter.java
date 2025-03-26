package com.adadapted.android.sdk.core.view;

/* loaded from: classes.dex */
public final class DimensionConverter {
    private static float scale;
    public static final DimensionConverter INSTANCE = new DimensionConverter();
    public static final int $stable = 8;

    private DimensionConverter() {
    }

    public final int convertDpToPx(int i8) {
        return i8 > 0 ? (int) ((i8 * scale) + 0.5f) : i8;
    }

    public final void createInstance(float f8) {
        scale = f8;
    }
}
