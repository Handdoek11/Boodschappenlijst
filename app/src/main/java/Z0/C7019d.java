package z0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import j$.util.Objects;

/* renamed from: z0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7019d {

    /* renamed from: a, reason: collision with root package name */
    private final f f44740a;

    /* renamed from: z0.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final c f44741a;

        public a(ClipData clipData, int i8) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f44741a = new b(clipData, i8);
            } else {
                this.f44741a = new C0360d(clipData, i8);
            }
        }

        public C7019d a() {
            return this.f44741a.a();
        }

        public a b(Bundle bundle) {
            this.f44741a.b(bundle);
            return this;
        }

        public a c(int i8) {
            this.f44741a.d(i8);
            return this;
        }

        public a d(Uri uri) {
            this.f44741a.c(uri);
            return this;
        }
    }

    /* renamed from: z0.d$b */
    private static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final ContentInfo.Builder f44742a;

        b(ClipData clipData, int i8) {
            this.f44742a = AbstractC7025g.a(clipData, i8);
        }

        @Override // z0.C7019d.c
        public C7019d a() {
            return new C7019d(new e(this.f44742a.build()));
        }

        @Override // z0.C7019d.c
        public void b(Bundle bundle) {
            this.f44742a.setExtras(bundle);
        }

        @Override // z0.C7019d.c
        public void c(Uri uri) {
            this.f44742a.setLinkUri(uri);
        }

        @Override // z0.C7019d.c
        public void d(int i8) {
            this.f44742a.setFlags(i8);
        }
    }

    /* renamed from: z0.d$c */
    private interface c {
        C7019d a();

        void b(Bundle bundle);

        void c(Uri uri);

        void d(int i8);
    }

    /* renamed from: z0.d$d, reason: collision with other inner class name */
    private static final class C0360d implements c {

        /* renamed from: a, reason: collision with root package name */
        ClipData f44743a;

        /* renamed from: b, reason: collision with root package name */
        int f44744b;

        /* renamed from: c, reason: collision with root package name */
        int f44745c;

        /* renamed from: d, reason: collision with root package name */
        Uri f44746d;

        /* renamed from: e, reason: collision with root package name */
        Bundle f44747e;

        C0360d(ClipData clipData, int i8) {
            this.f44743a = clipData;
            this.f44744b = i8;
        }

        @Override // z0.C7019d.c
        public C7019d a() {
            return new C7019d(new g(this));
        }

        @Override // z0.C7019d.c
        public void b(Bundle bundle) {
            this.f44747e = bundle;
        }

        @Override // z0.C7019d.c
        public void c(Uri uri) {
            this.f44746d = uri;
        }

        @Override // z0.C7019d.c
        public void d(int i8) {
            this.f44745c = i8;
        }
    }

    /* renamed from: z0.d$e */
    private static final class e implements f {

        /* renamed from: a, reason: collision with root package name */
        private final ContentInfo f44748a;

        e(ContentInfo contentInfo) {
            this.f44748a = AbstractC7017c.a(y0.i.g(contentInfo));
        }

        @Override // z0.C7019d.f
        public ClipData a() {
            return this.f44748a.getClip();
        }

        @Override // z0.C7019d.f
        public int b() {
            return this.f44748a.getFlags();
        }

        @Override // z0.C7019d.f
        public ContentInfo c() {
            return this.f44748a;
        }

        @Override // z0.C7019d.f
        public int getSource() {
            return this.f44748a.getSource();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f44748a + "}";
        }
    }

    /* renamed from: z0.d$f */
    private interface f {
        ClipData a();

        int b();

        ContentInfo c();

        int getSource();
    }

    /* renamed from: z0.d$g */
    private static final class g implements f {

        /* renamed from: a, reason: collision with root package name */
        private final ClipData f44749a;

        /* renamed from: b, reason: collision with root package name */
        private final int f44750b;

        /* renamed from: c, reason: collision with root package name */
        private final int f44751c;

        /* renamed from: d, reason: collision with root package name */
        private final Uri f44752d;

        /* renamed from: e, reason: collision with root package name */
        private final Bundle f44753e;

        g(C0360d c0360d) {
            this.f44749a = (ClipData) y0.i.g(c0360d.f44743a);
            this.f44750b = y0.i.c(c0360d.f44744b, 0, 5, "source");
            this.f44751c = y0.i.f(c0360d.f44745c, 1);
            this.f44752d = c0360d.f44746d;
            this.f44753e = c0360d.f44747e;
        }

        @Override // z0.C7019d.f
        public ClipData a() {
            return this.f44749a;
        }

        @Override // z0.C7019d.f
        public int b() {
            return this.f44751c;
        }

        @Override // z0.C7019d.f
        public ContentInfo c() {
            return null;
        }

        @Override // z0.C7019d.f
        public int getSource() {
            return this.f44750b;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.f44749a.getDescription());
            sb.append(", source=");
            sb.append(C7019d.e(this.f44750b));
            sb.append(", flags=");
            sb.append(C7019d.a(this.f44751c));
            if (this.f44752d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f44752d.toString().length() + ")";
            }
            sb.append(str);
            sb.append(this.f44753e != null ? ", hasExtras" : "");
            sb.append("}");
            return sb.toString();
        }
    }

    C7019d(f fVar) {
        this.f44740a = fVar;
    }

    static String a(int i8) {
        return (i8 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i8);
    }

    static String e(int i8) {
        return i8 != 0 ? i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? i8 != 5 ? String.valueOf(i8) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public static C7019d g(ContentInfo contentInfo) {
        return new C7019d(new e(contentInfo));
    }

    public ClipData b() {
        return this.f44740a.a();
    }

    public int c() {
        return this.f44740a.b();
    }

    public int d() {
        return this.f44740a.getSource();
    }

    public ContentInfo f() {
        ContentInfo c8 = this.f44740a.c();
        Objects.requireNonNull(c8);
        return AbstractC7017c.a(c8);
    }

    public String toString() {
        return this.f44740a.toString();
    }
}
