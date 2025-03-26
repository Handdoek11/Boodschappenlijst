package z6;

import J6.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: z6.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC7090c extends AbstractC7089b {
    public static float b(float f8, float... fArr) {
        r.e(fArr, "other");
        for (float f9 : fArr) {
            f8 = Math.max(f8, f9);
        }
        return f8;
    }

    public static float c(float f8, float... fArr) {
        r.e(fArr, "other");
        for (float f9 : fArr) {
            f8 = Math.min(f8, f9);
        }
        return f8;
    }
}
