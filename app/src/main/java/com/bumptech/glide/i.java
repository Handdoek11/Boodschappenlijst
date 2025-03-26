package com.bumptech.glide;

import P1.a;
import P1.b;
import P1.d;
import P1.e;
import P1.g;
import P1.l;
import P1.o;
import P1.s;
import P1.u;
import P1.v;
import P1.w;
import P1.x;
import P1.y;
import Q1.a;
import Q1.b;
import Q1.c;
import Q1.d;
import Q1.g;
import S1.a;
import T1.m;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.c;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.k;
import com.bumptech.glide.load.resource.bitmap.A;
import com.bumptech.glide.load.resource.bitmap.C;
import com.bumptech.glide.load.resource.bitmap.C1077a;
import com.bumptech.glide.load.resource.bitmap.C1078b;
import com.bumptech.glide.load.resource.bitmap.C1079c;
import com.bumptech.glide.load.resource.bitmap.C1085i;
import com.bumptech.glide.load.resource.bitmap.C1087k;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.E;
import com.bumptech.glide.load.resource.bitmap.G;
import com.bumptech.glide.load.resource.bitmap.I;
import com.bumptech.glide.load.resource.bitmap.K;
import com.bumptech.glide.load.resource.bitmap.t;
import com.bumptech.glide.load.resource.bitmap.w;
import d2.AbstractC5704f;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import l1.AbstractC6167a;

/* loaded from: classes.dex */
abstract class i {

    class a implements AbstractC5704f.b {

        /* renamed from: a, reason: collision with root package name */
        private boolean f12561a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f12562b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f12563c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ X1.a f12564d;

        a(b bVar, List list, X1.a aVar) {
            this.f12562b = bVar;
            this.f12563c = list;
            this.f12564d = aVar;
        }

        @Override // d2.AbstractC5704f.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Registry get() {
            if (this.f12561a) {
                throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            }
            AbstractC6167a.a("Glide registry");
            this.f12561a = true;
            try {
                return i.a(this.f12562b, this.f12563c, this.f12564d);
            } finally {
                this.f12561a = false;
                AbstractC6167a.b();
            }
        }
    }

    static Registry a(b bVar, List list, X1.a aVar) {
        M1.d f8 = bVar.f();
        M1.b e8 = bVar.e();
        Context applicationContext = bVar.i().getApplicationContext();
        e g8 = bVar.i().g();
        Registry registry = new Registry();
        b(applicationContext, registry, f8, e8, g8);
        c(applicationContext, bVar, registry, list, aVar);
        return registry;
    }

    private static void b(Context context, Registry registry, M1.d dVar, M1.b bVar, e eVar) {
        J1.j c1085i;
        J1.j g8;
        Class cls;
        Registry registry2;
        registry.o(new DefaultImageHeaderParser());
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 27) {
            registry.o(new w());
        }
        Resources resources = context.getResources();
        List g9 = registry.g();
        V1.a aVar = new V1.a(context, g9, dVar, bVar);
        J1.j m8 = K.m(dVar);
        t tVar = new t(registry.g(), resources.getDisplayMetrics(), dVar, bVar);
        if (i8 < 28 || !eVar.a(c.b.class)) {
            c1085i = new C1085i(tVar);
            g8 = new G(tVar, bVar);
        } else {
            g8 = new A();
            c1085i = new C1087k();
        }
        if (i8 >= 28) {
            registry.e("Animation", InputStream.class, Drawable.class, T1.h.f(g9, bVar));
            registry.e("Animation", ByteBuffer.class, Drawable.class, T1.h.a(g9, bVar));
        }
        T1.l lVar = new T1.l(context);
        C1079c c1079c = new C1079c(bVar);
        W1.a aVar2 = new W1.a();
        W1.d dVar2 = new W1.d();
        ContentResolver contentResolver = context.getContentResolver();
        registry.a(ByteBuffer.class, new P1.c()).a(InputStream.class, new u(bVar)).e("Bitmap", ByteBuffer.class, Bitmap.class, c1085i).e("Bitmap", InputStream.class, Bitmap.class, g8);
        if (ParcelFileDescriptorRewinder.c()) {
            registry.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new C(tVar));
        }
        registry.e("Bitmap", AssetFileDescriptor.class, Bitmap.class, K.c(dVar));
        registry.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, m8).d(Bitmap.class, Bitmap.class, w.a.a()).e("Bitmap", Bitmap.class, Bitmap.class, new I()).b(Bitmap.class, c1079c).e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C1077a(resources, c1085i)).e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C1077a(resources, g8)).e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C1077a(resources, m8)).b(BitmapDrawable.class, new C1078b(dVar, c1079c)).e("Animation", InputStream.class, V1.c.class, new V1.j(g9, aVar, bVar)).e("Animation", ByteBuffer.class, V1.c.class, aVar).b(V1.c.class, new V1.d()).d(I1.a.class, I1.a.class, w.a.a()).e("Bitmap", I1.a.class, Bitmap.class, new V1.h(dVar)).c(Uri.class, Drawable.class, lVar).c(Uri.class, Bitmap.class, new E(lVar, dVar)).p(new a.C0099a()).d(File.class, ByteBuffer.class, new d.b()).d(File.class, InputStream.class, new g.e()).c(File.class, File.class, new U1.a()).d(File.class, ParcelFileDescriptor.class, new g.b()).d(File.class, File.class, w.a.a()).p(new k.a(bVar));
        if (ParcelFileDescriptorRewinder.c()) {
            cls = BitmapDrawable.class;
            registry2 = registry;
            registry2.p(new ParcelFileDescriptorRewinder.a());
        } else {
            cls = BitmapDrawable.class;
            registry2 = registry;
        }
        o g10 = P1.f.g(context);
        o c8 = P1.f.c(context);
        o e8 = P1.f.e(context);
        Class cls2 = Integer.TYPE;
        registry2.d(cls2, InputStream.class, g10).d(Integer.class, InputStream.class, g10).d(cls2, AssetFileDescriptor.class, c8).d(Integer.class, AssetFileDescriptor.class, c8).d(cls2, Drawable.class, e8).d(Integer.class, Drawable.class, e8).d(Uri.class, InputStream.class, P1.t.f(context)).d(Uri.class, AssetFileDescriptor.class, P1.t.e(context));
        s.c cVar = new s.c(resources);
        s.a aVar3 = new s.a(resources);
        s.b bVar2 = new s.b(resources);
        Class cls3 = cls;
        registry2.d(Integer.class, Uri.class, cVar).d(cls2, Uri.class, cVar).d(Integer.class, AssetFileDescriptor.class, aVar3).d(cls2, AssetFileDescriptor.class, aVar3).d(Integer.class, InputStream.class, bVar2).d(cls2, InputStream.class, bVar2);
        registry2.d(String.class, InputStream.class, new e.c()).d(Uri.class, InputStream.class, new e.c()).d(String.class, InputStream.class, new v.c()).d(String.class, ParcelFileDescriptor.class, new v.b()).d(String.class, AssetFileDescriptor.class, new v.a()).d(Uri.class, InputStream.class, new a.c(context.getAssets())).d(Uri.class, AssetFileDescriptor.class, new a.b(context.getAssets())).d(Uri.class, InputStream.class, new b.a(context)).d(Uri.class, InputStream.class, new c.a(context));
        if (i8 >= 29) {
            registry2.d(Uri.class, InputStream.class, new d.c(context));
            registry2.d(Uri.class, ParcelFileDescriptor.class, new d.b(context));
        }
        registry2.d(Uri.class, InputStream.class, new x.d(contentResolver)).d(Uri.class, ParcelFileDescriptor.class, new x.b(contentResolver)).d(Uri.class, AssetFileDescriptor.class, new x.a(contentResolver)).d(Uri.class, InputStream.class, new y.a()).d(URL.class, InputStream.class, new g.a()).d(Uri.class, File.class, new l.a(context)).d(P1.h.class, InputStream.class, new a.C0092a()).d(byte[].class, ByteBuffer.class, new b.a()).d(byte[].class, InputStream.class, new b.d()).d(Uri.class, Uri.class, w.a.a()).d(Drawable.class, Drawable.class, w.a.a()).c(Drawable.class, Drawable.class, new m()).q(Bitmap.class, cls3, new W1.b(resources)).q(Bitmap.class, byte[].class, aVar2).q(Drawable.class, byte[].class, new W1.c(dVar, aVar2, dVar2)).q(V1.c.class, byte[].class, dVar2);
        J1.j d8 = K.d(dVar);
        registry2.c(ByteBuffer.class, Bitmap.class, d8);
        registry2.c(ByteBuffer.class, cls3, new C1077a(resources, d8));
    }

    private static void c(Context context, b bVar, Registry registry, List list, X1.a aVar) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.E.a(it.next());
            throw null;
        }
        if (aVar != null) {
            aVar.a(context, bVar, registry);
        }
    }

    static AbstractC5704f.b d(b bVar, List list, X1.a aVar) {
        return new a(bVar, list, aVar);
    }
}
