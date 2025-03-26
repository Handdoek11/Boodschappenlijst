package C0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final c f744a;

    private interface c {
        Uri a();

        void b();

        Uri c();

        Object d();

        ClipDescription getDescription();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f744a = new a(uri, clipDescription, uri2);
        } else {
            this.f744a = new b(uri, clipDescription, uri2);
        }
    }

    public static f f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new f(new a(obj));
        }
        return null;
    }

    public Uri a() {
        return this.f744a.a();
    }

    public ClipDescription b() {
        return this.f744a.getDescription();
    }

    public Uri c() {
        return this.f744a.c();
    }

    public void d() {
        this.f744a.b();
    }

    public Object e() {
        return this.f744a.d();
    }

    private static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        final InputContentInfo f745a;

        a(Object obj) {
            this.f745a = (InputContentInfo) obj;
        }

        @Override // C0.f.c
        public Uri a() {
            return this.f745a.getContentUri();
        }

        @Override // C0.f.c
        public void b() {
            this.f745a.requestPermission();
        }

        @Override // C0.f.c
        public Uri c() {
            return this.f745a.getLinkUri();
        }

        @Override // C0.f.c
        public Object d() {
            return this.f745a;
        }

        @Override // C0.f.c
        public ClipDescription getDescription() {
            return this.f745a.getDescription();
        }

        a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f745a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    private f(c cVar) {
        this.f744a = cVar;
    }

    private static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f746a;

        /* renamed from: b, reason: collision with root package name */
        private final ClipDescription f747b;

        /* renamed from: c, reason: collision with root package name */
        private final Uri f748c;

        b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f746a = uri;
            this.f747b = clipDescription;
            this.f748c = uri2;
        }

        @Override // C0.f.c
        public Uri a() {
            return this.f746a;
        }

        @Override // C0.f.c
        public Uri c() {
            return this.f748c;
        }

        @Override // C0.f.c
        public Object d() {
            return null;
        }

        @Override // C0.f.c
        public ClipDescription getDescription() {
            return this.f747b;
        }

        @Override // C0.f.c
        public void b() {
        }
    }
}
