package com.adadapted.android.sdk.core.view;

import J6.AbstractC0650j;

/* loaded from: classes.dex */
public final class Dimension {
    public static final int $stable = 8;
    private int height;
    private int width;

    public static final class Orientation {
        public static final int $stable = 0;
        public static final Orientation INSTANCE = new Orientation();
        public static final String LAND = "land";
        public static final String PORT = "port";

        private Orientation() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Dimension() {
        int i8 = 0;
        this(i8, i8, 3, null);
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setHeight(int i8) {
        this.height = i8;
    }

    public final void setWidth(int i8) {
        this.width = i8;
    }

    public Dimension(int i8, int i9) {
        this.height = i8;
        this.width = i9;
    }

    public /* synthetic */ Dimension(int i8, int i9, int i10, AbstractC0650j abstractC0650j) {
        this((i10 & 1) != 0 ? 0 : i8, (i10 & 2) != 0 ? 0 : i9);
    }
}
