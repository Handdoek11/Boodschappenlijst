package P1;

import P1.n;
import android.content.res.AssetManager;
import android.net.Uri;
import c2.C0978b;

/* loaded from: classes.dex */
public class a implements n {

    /* renamed from: c, reason: collision with root package name */
    private static final int f4291c = 22;

    /* renamed from: a, reason: collision with root package name */
    private final AssetManager f4292a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0084a f4293b;

    /* renamed from: P1.a$a, reason: collision with other inner class name */
    public interface InterfaceC0084a {
        com.bumptech.glide.load.data.d a(AssetManager assetManager, String str);
    }

    public static class b implements o, InterfaceC0084a {

        /* renamed from: a, reason: collision with root package name */
        private final AssetManager f4294a;

        public b(AssetManager assetManager) {
            this.f4294a = assetManager;
        }

        @Override // P1.a.InterfaceC0084a
        public com.bumptech.glide.load.data.d a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.h(assetManager, str);
        }

        @Override // P1.o
        public n d(r rVar) {
            return new a(this.f4294a, this);
        }
    }

    public static class c implements o, InterfaceC0084a {

        /* renamed from: a, reason: collision with root package name */
        private final AssetManager f4295a;

        public c(AssetManager assetManager) {
            this.f4295a = assetManager;
        }

        @Override // P1.a.InterfaceC0084a
        public com.bumptech.glide.load.data.d a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.m(assetManager, str);
        }

        @Override // P1.o
        public n d(r rVar) {
            return new a(this.f4295a, this);
        }
    }

    public a(AssetManager assetManager, InterfaceC0084a interfaceC0084a) {
        this.f4292a = assetManager;
        this.f4293b = interfaceC0084a;
    }

    @Override // P1.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(Uri uri, int i8, int i9, J1.h hVar) {
        return new n.a(new C0978b(uri), this.f4293b.a(this.f4292a, uri.toString().substring(f4291c)));
    }

    @Override // P1.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
