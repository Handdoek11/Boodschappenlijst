package u5;

/* loaded from: classes2.dex */
public enum g {
    TYPE_1_2("🏻"),
    TYPE_3("🏼"),
    TYPE_4("🏽"),
    TYPE_5("🏾"),
    TYPE_6("🏿");


    /* renamed from: o, reason: collision with root package name */
    public final String f44039o;

    g(String str) {
        this.f44039o = str;
    }

    public static g a(String str) {
        for (g gVar : values()) {
            if (gVar.f44039o.equals(str)) {
                return gVar;
            }
        }
        return null;
    }
}
