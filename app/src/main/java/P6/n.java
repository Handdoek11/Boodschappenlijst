package P6;

import J6.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class n {
    public static final void a(boolean z7, Number number) {
        r.e(number, "step");
        if (z7) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
    }

    public static e b(float f8, float f9) {
        return new d(f8, f9);
    }
}
