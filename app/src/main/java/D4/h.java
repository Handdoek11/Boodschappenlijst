package D4;

import D4.h;
import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final Map f2087a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f2088b;

    /* renamed from: c, reason: collision with root package name */
    private final A4.c f2089c;

    public static final class a implements B4.b {

        /* renamed from: d, reason: collision with root package name */
        private static final A4.c f2090d = new A4.c() { // from class: D4.g
            @Override // A4.c
            public final void a(Object obj, Object obj2) {
                h.a.e(obj, (A4.d) obj2);
            }
        };

        /* renamed from: a, reason: collision with root package name */
        private final Map f2091a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private final Map f2092b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        private A4.c f2093c = f2090d;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void e(Object obj, A4.d dVar) {
            throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h c() {
            return new h(new HashMap(this.f2091a), new HashMap(this.f2092b), this.f2093c);
        }

        public a d(B4.a aVar) {
            aVar.a(this);
            return this;
        }

        @Override // B4.b
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a a(Class cls, A4.c cVar) {
            this.f2091a.put(cls, cVar);
            this.f2092b.remove(cls);
            return this;
        }
    }

    h(Map map, Map map2, A4.c cVar) {
        this.f2087a = map;
        this.f2088b = map2;
        this.f2089c = cVar;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) {
        new f(outputStream, this.f2087a, this.f2088b, this.f2089c).t(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
