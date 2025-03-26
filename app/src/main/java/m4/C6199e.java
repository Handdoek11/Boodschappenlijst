package m4;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: m4.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C6199e {

    /* renamed from: a, reason: collision with root package name */
    private final Float f39046a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f39047b;

    private C6199e(Float f8, boolean z7) {
        this.f39047b = z7;
        this.f39046a = f8;
    }

    public static C6199e a(Context context) {
        boolean z7 = false;
        Float f8 = null;
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                z7 = e(registerReceiver);
                f8 = d(registerReceiver);
            }
        } catch (IllegalStateException e8) {
            j4.g.f().e("An error occurred getting battery state.", e8);
        }
        return new C6199e(f8, z7);
    }

    private static Float d(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(intExtra / intExtra2);
    }

    private static boolean e(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    public Float b() {
        return this.f39046a;
    }

    public int c() {
        Float f8;
        if (!this.f39047b || (f8 = this.f39046a) == null) {
            return 1;
        }
        return ((double) f8.floatValue()) < 0.99d ? 2 : 3;
    }
}
