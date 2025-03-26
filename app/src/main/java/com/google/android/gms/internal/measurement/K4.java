package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class K4 implements S4 {

    /* renamed from: a, reason: collision with root package name */
    private S4[] f28934a;

    K4(S4... s4Arr) {
        this.f28934a = s4Arr;
    }

    @Override // com.google.android.gms.internal.measurement.S4
    public final U4 a(Class cls) {
        for (S4 s42 : this.f28934a) {
            if (s42.b(cls)) {
                return s42.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
    }

    @Override // com.google.android.gms.internal.measurement.S4
    public final boolean b(Class cls) {
        for (S4 s42 : this.f28934a) {
            if (s42.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
