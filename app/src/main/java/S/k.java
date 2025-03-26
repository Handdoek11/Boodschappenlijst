package S;

import I6.p;
import J6.s;
import java.util.List;
import x6.C6916E;
import y6.AbstractC6987o;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f5032a = new k();

    /* renamed from: b, reason: collision with root package name */
    private static final n f5033b = m.b("ContentDescription", a.f5058o);

    /* renamed from: c, reason: collision with root package name */
    private static final n f5034c = m.a("StateDescription");

    /* renamed from: d, reason: collision with root package name */
    private static final n f5035d = m.a("ProgressBarRangeInfo");

    /* renamed from: e, reason: collision with root package name */
    private static final n f5036e = m.b("PaneTitle", e.f5062o);

    /* renamed from: f, reason: collision with root package name */
    private static final n f5037f = m.a("SelectableGroup");

    /* renamed from: g, reason: collision with root package name */
    private static final n f5038g = m.a("CollectionInfo");

    /* renamed from: h, reason: collision with root package name */
    private static final n f5039h = m.a("CollectionItemInfo");

    /* renamed from: i, reason: collision with root package name */
    private static final n f5040i = m.a("Heading");

    /* renamed from: j, reason: collision with root package name */
    private static final n f5041j = m.a("Disabled");

    /* renamed from: k, reason: collision with root package name */
    private static final n f5042k = m.a("LiveRegion");

    /* renamed from: l, reason: collision with root package name */
    private static final n f5043l = m.a("Focused");

    /* renamed from: m, reason: collision with root package name */
    private static final n f5044m = m.a("IsTraversalGroup");

    /* renamed from: n, reason: collision with root package name */
    private static final n f5045n = new n("InvisibleToUser", b.f5059o);

    /* renamed from: o, reason: collision with root package name */
    private static final n f5046o = m.b("TraversalIndex", i.f5066o);

    /* renamed from: p, reason: collision with root package name */
    private static final n f5047p = m.a("HorizontalScrollAxisRange");

    /* renamed from: q, reason: collision with root package name */
    private static final n f5048q = m.a("VerticalScrollAxisRange");

    /* renamed from: r, reason: collision with root package name */
    private static final n f5049r = m.b("IsPopup", d.f5061o);

    /* renamed from: s, reason: collision with root package name */
    private static final n f5050s = m.b("IsDialog", c.f5060o);

    /* renamed from: t, reason: collision with root package name */
    private static final n f5051t = m.b("Role", f.f5063o);

    /* renamed from: u, reason: collision with root package name */
    private static final n f5052u = new n("TestTag", false, g.f5064o);

    /* renamed from: v, reason: collision with root package name */
    private static final n f5053v = m.b("Text", h.f5065o);

    /* renamed from: w, reason: collision with root package name */
    private static final n f5054w = new n("TextSubstitution", null, 2, null);

    /* renamed from: x, reason: collision with root package name */
    private static final n f5055x = new n("IsShowingTextSubstitution", null, 2, null);

    /* renamed from: y, reason: collision with root package name */
    private static final n f5056y = m.a("EditableText");

    /* renamed from: z, reason: collision with root package name */
    private static final n f5057z = m.a("TextSelectionRange");

    /* renamed from: A, reason: collision with root package name */
    private static final n f5025A = m.a("ImeAction");

    /* renamed from: B, reason: collision with root package name */
    private static final n f5026B = m.a("Selected");

    /* renamed from: C, reason: collision with root package name */
    private static final n f5027C = m.a("ToggleableState");

    /* renamed from: D, reason: collision with root package name */
    private static final n f5028D = m.a("Password");

    /* renamed from: E, reason: collision with root package name */
    private static final n f5029E = m.a("Error");

    /* renamed from: F, reason: collision with root package name */
    private static final n f5030F = new n("IndexForKey", null, 2, null);

    /* renamed from: G, reason: collision with root package name */
    public static final int f5031G = 8;

    static final class a extends s implements p {

        /* renamed from: o, reason: collision with root package name */
        public static final a f5058o = new a();

        a() {
            super(2);
        }

        @Override // I6.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List invoke(List list, List list2) {
            List c02;
            if (list == null || (c02 = AbstractC6987o.c0(list)) == null) {
                return list2;
            }
            c02.addAll(list2);
            return c02;
        }
    }

    static final class c extends s implements p {

        /* renamed from: o, reason: collision with root package name */
        public static final c f5060o = new c();

        c() {
            super(2);
        }

        @Override // I6.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6916E invoke(C6916E c6916e, C6916E c6916e2) {
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    }

    static final class d extends s implements p {

        /* renamed from: o, reason: collision with root package name */
        public static final d f5061o = new d();

        d() {
            super(2);
        }

        @Override // I6.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6916E invoke(C6916E c6916e, C6916E c6916e2) {
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    }

    static final class e extends s implements p {

        /* renamed from: o, reason: collision with root package name */
        public static final e f5062o = new e();

        e() {
            super(2);
        }

        @Override // I6.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    }

    static final class h extends s implements p {

        /* renamed from: o, reason: collision with root package name */
        public static final h f5065o = new h();

        h() {
            super(2);
        }

        @Override // I6.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List invoke(List list, List list2) {
            List c02;
            if (list == null || (c02 = AbstractC6987o.c0(list)) == null) {
                return list2;
            }
            c02.addAll(list2);
            return c02;
        }
    }

    private k() {
    }

    public final n a() {
        return f5038g;
    }

    public final n b() {
        return f5039h;
    }

    public final n c() {
        return f5033b;
    }

    public final n d() {
        return f5056y;
    }

    public final n e() {
        return f5043l;
    }

    public final n f() {
        return f5047p;
    }

    public final n g() {
        return f5025A;
    }

    public final n h() {
        return f5045n;
    }

    public final n i() {
        return f5055x;
    }

    public final n j() {
        return f5044m;
    }

    public final n k() {
        return f5042k;
    }

    public final n l() {
        return f5036e;
    }

    public final n m() {
        return f5028D;
    }

    public final n n() {
        return f5035d;
    }

    public final n o() {
        return f5051t;
    }

    public final n p() {
        return f5026B;
    }

    public final n q() {
        return f5034c;
    }

    public final n r() {
        return f5052u;
    }

    public final n s() {
        return f5053v;
    }

    public final n t() {
        return f5057z;
    }

    public final n u() {
        return f5054w;
    }

    public final n v() {
        return f5027C;
    }

    public final n w() {
        return f5046o;
    }

    public final n x() {
        return f5048q;
    }

    static final class b extends s implements p {

        /* renamed from: o, reason: collision with root package name */
        public static final b f5059o = new b();

        b() {
            super(2);
        }

        @Override // I6.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6916E invoke(C6916E c6916e, C6916E c6916e2) {
            return c6916e;
        }
    }

    static final class f extends s implements p {

        /* renamed from: o, reason: collision with root package name */
        public static final f f5063o = new f();

        f() {
            super(2);
        }

        @Override // I6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b((S.c) obj, ((S.c) obj2).i());
        }

        public final S.c b(S.c cVar, int i8) {
            return cVar;
        }
    }

    static final class g extends s implements p {

        /* renamed from: o, reason: collision with root package name */
        public static final g f5064o = new g();

        g() {
            super(2);
        }

        @Override // I6.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            return str;
        }
    }

    static final class i extends s implements p {

        /* renamed from: o, reason: collision with root package name */
        public static final i f5066o = new i();

        i() {
            super(2);
        }

        @Override // I6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b((Float) obj, ((Number) obj2).floatValue());
        }

        public final Float b(Float f8, float f9) {
            return f8;
        }
    }
}
