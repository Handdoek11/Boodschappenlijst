package H;

import J6.AbstractC0650j;

/* renamed from: H.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0625a {

    /* renamed from: b, reason: collision with root package name */
    public static final d f2767b = new d(null);

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC0625a f2768c = new C0045a(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC0625a f2769d = new c(new float[]{0.40024f, -0.2263f, 0.0f, 0.7076f, 1.16532f, 0.0f, -0.08081f, 0.0457f, 0.91822f});

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC0625a f2770e = new b(new float[]{0.7328f, -0.7036f, 0.003f, 0.4296f, 1.6975f, 0.0136f, -0.1624f, 0.0061f, 0.9834f});

    /* renamed from: a, reason: collision with root package name */
    private final float[] f2771a;

    /* renamed from: H.a$a, reason: collision with other inner class name */
    public static final class C0045a extends AbstractC0625a {
        C0045a(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "Bradford";
        }
    }

    /* renamed from: H.a$b */
    public static final class b extends AbstractC0625a {
        b(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "Ciecat02";
        }
    }

    /* renamed from: H.a$c */
    public static final class c extends AbstractC0625a {
        c(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "VonKries";
        }
    }

    /* renamed from: H.a$d */
    public static final class d {
        public /* synthetic */ d(AbstractC0650j abstractC0650j) {
            this();
        }

        public final AbstractC0625a a() {
            return AbstractC0625a.f2768c;
        }

        private d() {
        }
    }

    public /* synthetic */ AbstractC0625a(float[] fArr, AbstractC0650j abstractC0650j) {
        this(fArr);
    }

    public final float[] b() {
        return this.f2771a;
    }

    private AbstractC0625a(float[] fArr) {
        this.f2771a = fArr;
    }
}
