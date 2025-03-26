package P1;

import P1.n;
import c2.C0978b;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class b implements n {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0086b f4296a;

    public static class a implements o {

        /* renamed from: P1.b$a$a, reason: collision with other inner class name */
        class C0085a implements InterfaceC0086b {
            C0085a() {
            }

            @Override // P1.b.InterfaceC0086b
            public Class a() {
                return ByteBuffer.class;
            }

            @Override // P1.b.InterfaceC0086b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // P1.o
        public n d(r rVar) {
            return new b(new C0085a());
        }
    }

    /* renamed from: P1.b$b, reason: collision with other inner class name */
    public interface InterfaceC0086b {
        Class a();

        Object b(byte[] bArr);
    }

    public static class d implements o {

        class a implements InterfaceC0086b {
            a() {
            }

            @Override // P1.b.InterfaceC0086b
            public Class a() {
                return InputStream.class;
            }

            @Override // P1.b.InterfaceC0086b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // P1.o
        public n d(r rVar) {
            return new b(new a());
        }
    }

    public b(InterfaceC0086b interfaceC0086b) {
        this.f4296a = interfaceC0086b;
    }

    @Override // P1.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(byte[] bArr, int i8, int i9, J1.h hVar) {
        return new n.a(new C0978b(bArr), new c(bArr, this.f4296a));
    }

    @Override // P1.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(byte[] bArr) {
        return true;
    }

    private static class c implements com.bumptech.glide.load.data.d {

        /* renamed from: o, reason: collision with root package name */
        private final byte[] f4298o;

        /* renamed from: s, reason: collision with root package name */
        private final InterfaceC0086b f4299s;

        c(byte[] bArr, InterfaceC0086b interfaceC0086b) {
            this.f4298o = bArr;
            this.f4299s = interfaceC0086b;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f4299s.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public J1.a d() {
            return J1.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a aVar) {
            aVar.f(this.f4299s.b(this.f4298o));
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}
