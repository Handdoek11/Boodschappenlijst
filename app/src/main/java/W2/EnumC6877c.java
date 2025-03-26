package w2;

/* renamed from: w2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC6877c {
    BANNER(0),
    INTERSTITIAL(1),
    REWARDED(2),
    REWARDED_INTERSTITIAL(3),
    NATIVE(4),
    APP_OPEN_AD(6);


    /* renamed from: o, reason: collision with root package name */
    private final int f44264o;

    EnumC6877c(int i8) {
        this.f44264o = i8;
    }

    public static EnumC6877c a(int i8) {
        for (EnumC6877c enumC6877c : values()) {
            if (enumC6877c.c() == i8) {
                return enumC6877c;
            }
        }
        return null;
    }

    public int c() {
        return this.f44264o;
    }
}
