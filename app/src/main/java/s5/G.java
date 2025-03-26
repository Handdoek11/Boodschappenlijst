package s5;

import com.google.protobuf.h;

/* loaded from: classes2.dex */
public enum G {
    FEATURE_AA_KEYWORD_INTERCEPT(0, 1),
    FEATURE_AA_OUT_OF_APP_ADS(1, 2),
    FEATURE_AA_LIST_MANAGER(2, 4),
    FEATURE_CONNECTIVITY_WARNING(3, 8),
    FEATURE_UNITS_MORE_LESS(4, 16);


    /* renamed from: x, reason: collision with root package name */
    private static h.a f42804x = new h.a() { // from class: s5.G.a
    };

    /* renamed from: o, reason: collision with root package name */
    private final int f42806o;

    G(int i8, int i9) {
        this.f42806o = i9;
    }

    public final int e() {
        return this.f42806o;
    }
}
