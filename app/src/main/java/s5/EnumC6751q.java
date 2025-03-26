package s5;

import com.google.protobuf.h;

/* renamed from: s5.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC6751q {
    FIRST_VERSION(0, 0),
    VERSION_WITH_CATEGORIES(1, 1),
    VERSION_WITH_OWNING_PERSON(2, 2),
    VERSION_WITH_MANY_AD_NETWORKS(3, 3),
    VERSION_WITH_PASSWORD_RESET(4, 4),
    VERSION_WITH_CLIENT_ID_RESET(5, 5),
    VERSION_WITH_FLIPP(6, 6),
    VERSION_WITH_FLIPP_FIXED(7, 7);


    /* renamed from: A, reason: collision with root package name */
    private static h.a f43452A = new h.a() { // from class: s5.q.a
    };

    /* renamed from: o, reason: collision with root package name */
    private final int f43462o;

    EnumC6751q(int i8, int i9) {
        this.f43462o = i9;
    }

    public final int e() {
        return this.f43462o;
    }
}
