package Q1;

import J1.h;
import P1.n;
import P1.o;
import P1.r;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import c2.C0978b;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class d implements n {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4673a;

    /* renamed from: b, reason: collision with root package name */
    private final n f4674b;

    /* renamed from: c, reason: collision with root package name */
    private final n f4675c;

    /* renamed from: d, reason: collision with root package name */
    private final Class f4676d;

    private static abstract class a implements o {

        /* renamed from: a, reason: collision with root package name */
        private final Context f4677a;

        /* renamed from: b, reason: collision with root package name */
        private final Class f4678b;

        a(Context context, Class cls) {
            this.f4677a = context;
            this.f4678b = cls;
        }

        @Override // P1.o
        public final n d(r rVar) {
            return new d(this.f4677a, rVar.d(File.class, this.f4678b), rVar.d(Uri.class, this.f4678b), this.f4678b);
        }
    }

    public static final class b extends a {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    public static final class c extends a {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: Q1.d$d, reason: collision with other inner class name */
    private static final class C0093d implements com.bumptech.glide.load.data.d {

        /* renamed from: B, reason: collision with root package name */
        private static final String[] f4679B = {"_data"};

        /* renamed from: A, reason: collision with root package name */
        private volatile com.bumptech.glide.load.data.d f4680A;

        /* renamed from: o, reason: collision with root package name */
        private final Context f4681o;

        /* renamed from: s, reason: collision with root package name */
        private final n f4682s;

        /* renamed from: t, reason: collision with root package name */
        private final n f4683t;

        /* renamed from: u, reason: collision with root package name */
        private final Uri f4684u;

        /* renamed from: v, reason: collision with root package name */
        private final int f4685v;

        /* renamed from: w, reason: collision with root package name */
        private final int f4686w;

        /* renamed from: x, reason: collision with root package name */
        private final h f4687x;

        /* renamed from: y, reason: collision with root package name */
        private final Class f4688y;

        /* renamed from: z, reason: collision with root package name */
        private volatile boolean f4689z;

        C0093d(Context context, n nVar, n nVar2, Uri uri, int i8, int i9, h hVar, Class cls) {
            this.f4681o = context.getApplicationContext();
            this.f4682s = nVar;
            this.f4683t = nVar2;
            this.f4684u = uri;
            this.f4685v = i8;
            this.f4686w = i9;
            this.f4687x = hVar;
            this.f4688y = cls;
        }

        private n.a c() {
            if (Environment.isExternalStorageLegacy()) {
                return this.f4682s.a(h(this.f4684u), this.f4685v, this.f4686w, this.f4687x);
            }
            if (K1.b.a(this.f4684u)) {
                return this.f4683t.a(this.f4684u, this.f4685v, this.f4686w, this.f4687x);
            }
            return this.f4683t.a(g() ? MediaStore.setRequireOriginal(this.f4684u) : this.f4684u, this.f4685v, this.f4686w, this.f4687x);
        }

        private com.bumptech.glide.load.data.d f() {
            n.a c8 = c();
            if (c8 != null) {
                return c8.f4353c;
            }
            return null;
        }

        private boolean g() {
            return this.f4681o.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        private File h(Uri uri) {
            Cursor cursor = null;
            try {
                Cursor query = this.f4681o.getContentResolver().query(uri, f4679B, null, null, null);
                if (query == null || !query.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = query.getString(query.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    query.close();
                    return file;
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f4688y;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            com.bumptech.glide.load.data.d dVar = this.f4680A;
            if (dVar != null) {
                dVar.b();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f4689z = true;
            com.bumptech.glide.load.data.d dVar = this.f4680A;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public J1.a d() {
            return J1.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a aVar) {
            try {
                com.bumptech.glide.load.data.d f8 = f();
                if (f8 == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f4684u));
                    return;
                }
                this.f4680A = f8;
                if (this.f4689z) {
                    cancel();
                } else {
                    f8.e(gVar, aVar);
                }
            } catch (FileNotFoundException e8) {
                aVar.c(e8);
            }
        }
    }

    d(Context context, n nVar, n nVar2, Class cls) {
        this.f4673a = context.getApplicationContext();
        this.f4674b = nVar;
        this.f4675c = nVar2;
        this.f4676d = cls;
    }

    @Override // P1.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(Uri uri, int i8, int i9, h hVar) {
        return new n.a(new C0978b(uri), new C0093d(this.f4673a, this.f4674b, this.f4675c, uri, i8, i9, hVar, this.f4676d));
    }

    @Override // P1.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && K1.b.c(uri);
    }
}
