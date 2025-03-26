package P1;

import P1.n;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import c2.C0978b;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;

/* loaded from: classes.dex */
public final class l implements n {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4340a;

    public static final class a implements o {

        /* renamed from: a, reason: collision with root package name */
        private final Context f4341a;

        public a(Context context) {
            this.f4341a = context;
        }

        @Override // P1.o
        public n d(r rVar) {
            return new l(this.f4341a);
        }
    }

    public l(Context context) {
        this.f4340a = context;
    }

    @Override // P1.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(Uri uri, int i8, int i9, J1.h hVar) {
        return new n.a(new C0978b(uri), new b(this.f4340a, uri));
    }

    @Override // P1.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return K1.b.c(uri);
    }

    private static class b implements com.bumptech.glide.load.data.d {

        /* renamed from: t, reason: collision with root package name */
        private static final String[] f4342t = {"_data"};

        /* renamed from: o, reason: collision with root package name */
        private final Context f4343o;

        /* renamed from: s, reason: collision with root package name */
        private final Uri f4344s;

        b(Context context, Uri uri) {
            this.f4343o = context;
            this.f4344s = uri;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public J1.a d() {
            return J1.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a aVar) {
            Cursor query = this.f4343o.getContentResolver().query(this.f4344s, f4342t, null, null, null);
            if (query != null) {
                try {
                    r0 = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
                } finally {
                    query.close();
                }
            }
            if (!TextUtils.isEmpty(r0)) {
                aVar.f(new File(r0));
                return;
            }
            aVar.c(new FileNotFoundException("Failed to find file path for: " + this.f4344s));
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}
