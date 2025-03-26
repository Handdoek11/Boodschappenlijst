package P1;

import P1.n;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import c2.C0978b;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class g implements n {

    /* renamed from: a, reason: collision with root package name */
    private final d f4318a;

    public static class a implements o {

        /* renamed from: a, reason: collision with root package name */
        private final d f4319a;

        public a(d dVar) {
            this.f4319a = dVar;
        }

        @Override // P1.o
        public final n d(r rVar) {
            return new g(this.f4319a);
        }
    }

    public static class b extends a {

        class a implements d {
            a() {
            }

            @Override // P1.g.d
            public Class a() {
                return ParcelFileDescriptor.class;
            }

            @Override // P1.g.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(ParcelFileDescriptor parcelFileDescriptor) {
                parcelFileDescriptor.close();
            }

            @Override // P1.g.d
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public ParcelFileDescriptor c(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    public interface d {
        Class a();

        void b(Object obj);

        Object c(File file);
    }

    public static class e extends a {

        class a implements d {
            a() {
            }

            @Override // P1.g.d
            public Class a() {
                return InputStream.class;
            }

            @Override // P1.g.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(InputStream inputStream) {
                inputStream.close();
            }

            @Override // P1.g.d
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream c(File file) {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public g(d dVar) {
        this.f4318a = dVar;
    }

    @Override // P1.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(File file, int i8, int i9, J1.h hVar) {
        return new n.a(new C0978b(file), new c(file, this.f4318a));
    }

    @Override // P1.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(File file) {
        return true;
    }

    private static final class c implements com.bumptech.glide.load.data.d {

        /* renamed from: o, reason: collision with root package name */
        private final File f4320o;

        /* renamed from: s, reason: collision with root package name */
        private final d f4321s;

        /* renamed from: t, reason: collision with root package name */
        private Object f4322t;

        c(File file, d dVar) {
            this.f4320o = file;
            this.f4321s = dVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f4321s.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            Object obj = this.f4322t;
            if (obj != null) {
                try {
                    this.f4321s.b(obj);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public J1.a d() {
            return J1.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a aVar) {
            try {
                Object c8 = this.f4321s.c(this.f4320o);
                this.f4322t = c8;
                aVar.f(c8);
            } catch (FileNotFoundException e8) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e8);
                }
                aVar.c(e8);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}
