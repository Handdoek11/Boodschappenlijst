package S6;

import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f5129a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f5130b;

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f5131c;

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f5132d;

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f5133e;

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f5134f;

    /* renamed from: g, reason: collision with root package name */
    public static final Charset f5135g;

    static {
        Charset forName = Charset.forName("UTF-8");
        J6.r.d(forName, "forName(...)");
        f5130b = forName;
        Charset forName2 = Charset.forName("UTF-16");
        J6.r.d(forName2, "forName(...)");
        f5131c = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        J6.r.d(forName3, "forName(...)");
        f5132d = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        J6.r.d(forName4, "forName(...)");
        f5133e = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        J6.r.d(forName5, "forName(...)");
        f5134f = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        J6.r.d(forName6, "forName(...)");
        f5135g = forName6;
    }

    private d() {
    }
}
