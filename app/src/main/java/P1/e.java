package P1;

import P1.n;
import android.util.Base64;
import c2.C0978b;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class e implements n {

    /* renamed from: a, reason: collision with root package name */
    private final a f4302a;

    public interface a {
        Class a();

        void b(Object obj);

        Object c(String str);
    }

    public static final class c implements o {

        /* renamed from: a, reason: collision with root package name */
        private final a f4306a = new a();

        class a implements a {
            a() {
            }

            @Override // P1.e.a
            public Class a() {
                return InputStream.class;
            }

            @Override // P1.e.a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(InputStream inputStream) {
                inputStream.close();
            }

            @Override // P1.e.a
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream c(String str) {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int indexOf = str.indexOf(44);
                if (indexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, indexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        }

        @Override // P1.o
        public n d(r rVar) {
            return new e(this.f4306a);
        }
    }

    public e(a aVar) {
        this.f4302a = aVar;
    }

    @Override // P1.n
    public n.a a(Object obj, int i8, int i9, J1.h hVar) {
        return new n.a(new C0978b(obj), new b(obj.toString(), this.f4302a));
    }

    @Override // P1.n
    public boolean b(Object obj) {
        return obj.toString().startsWith("data:image");
    }

    private static final class b implements com.bumptech.glide.load.data.d {

        /* renamed from: o, reason: collision with root package name */
        private final String f4303o;

        /* renamed from: s, reason: collision with root package name */
        private final a f4304s;

        /* renamed from: t, reason: collision with root package name */
        private Object f4305t;

        b(String str, a aVar) {
            this.f4303o = str;
            this.f4304s = aVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f4304s.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            try {
                this.f4304s.b(this.f4305t);
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public J1.a d() {
            return J1.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a aVar) {
            try {
                Object c8 = this.f4304s.c(this.f4303o);
                this.f4305t = c8;
                aVar.f(c8);
            } catch (IllegalArgumentException e8) {
                aVar.c(e8);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}
