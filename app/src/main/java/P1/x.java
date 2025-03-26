package P1;

import P1.n;
import android.content.ContentResolver;
import android.net.Uri;
import c2.C0978b;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class x implements n {

    /* renamed from: b, reason: collision with root package name */
    private static final Set f4390b = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* renamed from: a, reason: collision with root package name */
    private final c f4391a;

    public static final class a implements o, c {

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f4392a;

        public a(ContentResolver contentResolver) {
            this.f4392a = contentResolver;
        }

        @Override // P1.x.c
        public com.bumptech.glide.load.data.d a(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f4392a, uri);
        }

        @Override // P1.o
        public n d(r rVar) {
            return new x(this);
        }
    }

    public static class b implements o, c {

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f4393a;

        public b(ContentResolver contentResolver) {
            this.f4393a = contentResolver;
        }

        @Override // P1.x.c
        public com.bumptech.glide.load.data.d a(Uri uri) {
            return new com.bumptech.glide.load.data.i(this.f4393a, uri);
        }

        @Override // P1.o
        public n d(r rVar) {
            return new x(this);
        }
    }

    public interface c {
        com.bumptech.glide.load.data.d a(Uri uri);
    }

    public static class d implements o, c {

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f4394a;

        public d(ContentResolver contentResolver) {
            this.f4394a = contentResolver;
        }

        @Override // P1.x.c
        public com.bumptech.glide.load.data.d a(Uri uri) {
            return new com.bumptech.glide.load.data.n(this.f4394a, uri);
        }

        @Override // P1.o
        public n d(r rVar) {
            return new x(this);
        }
    }

    public x(c cVar) {
        this.f4391a = cVar;
    }

    @Override // P1.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(Uri uri, int i8, int i9, J1.h hVar) {
        return new n.a(new C0978b(uri), this.f4391a.a(uri));
    }

    @Override // P1.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return f4390b.contains(uri.getScheme());
    }
}
