package androidx.vectordrawable.graphics.drawable;

import android.animation.TypeEvaluator;

/* loaded from: classes.dex */
public class f implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    private static final f f11621a = new f();

    public static f a() {
        return f11621a;
    }

    @Override // android.animation.TypeEvaluator
    public Object evaluate(float f8, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f9 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float f10 = f9 + (((((intValue2 >> 24) & 255) / 255.0f) - f9) * f8);
        float pow5 = pow2 + ((((float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d)) - pow2) * f8);
        float pow6 = pow3 + (f8 * (((float) Math.pow((intValue2 & 255) / 255.0f, 2.2d)) - pow3));
        return Integer.valueOf((Math.round(((float) Math.pow(pow + ((pow4 - pow) * f8), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(f10 * 255.0f) << 24) | (Math.round(((float) Math.pow(pow5, 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(pow6, 0.45454545454545453d)) * 255.0f));
    }
}
