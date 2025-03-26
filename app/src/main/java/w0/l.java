package w0;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class l {

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f44222a;

        /* renamed from: b, reason: collision with root package name */
        private final int f44223b;

        /* renamed from: c, reason: collision with root package name */
        private final int f44224c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f44225d;

        /* renamed from: e, reason: collision with root package name */
        private final int f44226e;

        public b(Uri uri, int i8, int i9, boolean z7, int i10) {
            this.f44222a = (Uri) y0.i.g(uri);
            this.f44223b = i8;
            this.f44224c = i9;
            this.f44225d = z7;
            this.f44226e = i10;
        }

        static b a(Uri uri, int i8, int i9, boolean z7, int i10) {
            return new b(uri, i8, i9, z7, i10);
        }

        public int b() {
            return this.f44226e;
        }

        public int c() {
            return this.f44223b;
        }

        public Uri d() {
            return this.f44222a;
        }

        public int e() {
            return this.f44224c;
        }

        public boolean f() {
            return this.f44225d;
        }
    }

    public static class c {
        public abstract void a(int i8);

        public abstract void b(Typeface typeface);
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return q0.h.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, f fVar) {
        return e.e(context, q0.g.a(new Object[]{fVar}), cancellationSignal);
    }

    public static Typeface c(Context context, List list, int i8, boolean z7, int i9, Handler handler, c cVar) {
        C6863a c6863a = new C6863a(cVar, m.b(handler));
        if (!z7) {
            return j.d(context, list, i8, null, c6863a);
        }
        if (list.size() <= 1) {
            return j.e(context, (f) list.get(0), c6863a, i8, i9);
        }
        throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f44220a;

        /* renamed from: b, reason: collision with root package name */
        private final List f44221b;

        public a(int i8, b[] bVarArr) {
            this.f44220a = i8;
            this.f44221b = Collections.singletonList(bVarArr);
        }

        static a a(int i8, List list) {
            return new a(i8, list);
        }

        static a b(int i8, b[] bVarArr) {
            return new a(i8, bVarArr);
        }

        public b[] c() {
            return (b[]) this.f44221b.get(0);
        }

        public List d() {
            return this.f44221b;
        }

        public int e() {
            return this.f44220a;
        }

        boolean f() {
            return this.f44221b.size() > 1;
        }

        a(int i8, List list) {
            this.f44220a = i8;
            this.f44221b = list;
        }
    }
}
