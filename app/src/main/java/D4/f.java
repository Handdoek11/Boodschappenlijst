package D4;

import D4.d;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.firebase.encoders.EncodingException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class f implements A4.d {

    /* renamed from: f, reason: collision with root package name */
    private static final Charset f2077f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    private static final A4.b f2078g = A4.b.a("key").b(D4.a.b().c(1).a()).a();

    /* renamed from: h, reason: collision with root package name */
    private static final A4.b f2079h = A4.b.a("value").b(D4.a.b().c(2).a()).a();

    /* renamed from: i, reason: collision with root package name */
    private static final A4.c f2080i = new A4.c() { // from class: D4.e
        @Override // A4.c
        public final void a(Object obj, Object obj2) {
            f.w((Map.Entry) obj, (A4.d) obj2);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private OutputStream f2081a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f2082b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f2083c;

    /* renamed from: d, reason: collision with root package name */
    private final A4.c f2084d;

    /* renamed from: e, reason: collision with root package name */
    private final i f2085e = new i(this);

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2086a;

        static {
            int[] iArr = new int[d.a.values().length];
            f2086a = iArr;
            try {
                iArr[d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2086a[d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2086a[d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    f(OutputStream outputStream, Map map, Map map2, A4.c cVar) {
        this.f2081a = outputStream;
        this.f2082b = map;
        this.f2083c = map2;
        this.f2084d = cVar;
    }

    private static ByteBuffer p(int i8) {
        return ByteBuffer.allocate(i8).order(ByteOrder.LITTLE_ENDIAN);
    }

    private long q(A4.c cVar, Object obj) {
        b bVar = new b();
        try {
            OutputStream outputStream = this.f2081a;
            this.f2081a = bVar;
            try {
                cVar.a(obj, this);
                this.f2081a = outputStream;
                long d8 = bVar.d();
                bVar.close();
                return d8;
            } catch (Throwable th) {
                this.f2081a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private f r(A4.c cVar, A4.b bVar, Object obj, boolean z7) {
        long q8 = q(cVar, obj);
        if (z7 && q8 == 0) {
            return this;
        }
        x((v(bVar) << 3) | 2);
        y(q8);
        cVar.a(obj, this);
        return this;
    }

    private f s(A4.e eVar, A4.b bVar, Object obj, boolean z7) {
        this.f2085e.c(bVar, z7);
        eVar.a(obj, this.f2085e);
        return this;
    }

    private static d u(A4.b bVar) {
        d dVar = (d) bVar.c(d.class);
        if (dVar != null) {
            return dVar;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private static int v(A4.b bVar) {
        d dVar = (d) bVar.c(d.class);
        if (dVar != null) {
            return dVar.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w(Map.Entry entry, A4.d dVar) {
        dVar.a(f2078g, entry.getKey());
        dVar.a(f2079h, entry.getValue());
    }

    private void x(int i8) {
        while ((i8 & (-128)) != 0) {
            this.f2081a.write((i8 & ModuleDescriptor.MODULE_VERSION) | 128);
            i8 >>>= 7;
        }
        this.f2081a.write(i8 & ModuleDescriptor.MODULE_VERSION);
    }

    private void y(long j8) {
        while (((-128) & j8) != 0) {
            this.f2081a.write((((int) j8) & ModuleDescriptor.MODULE_VERSION) | 128);
            j8 >>>= 7;
        }
        this.f2081a.write(((int) j8) & ModuleDescriptor.MODULE_VERSION);
    }

    @Override // A4.d
    public A4.d a(A4.b bVar, Object obj) {
        return i(bVar, obj, true);
    }

    @Override // A4.d
    public A4.d c(A4.b bVar, double d8) {
        return d(bVar, d8, true);
    }

    A4.d d(A4.b bVar, double d8, boolean z7) {
        if (z7 && d8 == 0.0d) {
            return this;
        }
        x((v(bVar) << 3) | 1);
        this.f2081a.write(p(8).putDouble(d8).array());
        return this;
    }

    A4.d h(A4.b bVar, float f8, boolean z7) {
        if (z7 && f8 == 0.0f) {
            return this;
        }
        x((v(bVar) << 3) | 5);
        this.f2081a.write(p(4).putFloat(f8).array());
        return this;
    }

    A4.d i(A4.b bVar, Object obj, boolean z7) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z7 && charSequence.length() == 0) {
                return this;
            }
            x((v(bVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f2077f);
            x(bytes.length);
            this.f2081a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                i(bVar, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                r(f2080i, bVar, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            return d(bVar, ((Double) obj).doubleValue(), z7);
        }
        if (obj instanceof Float) {
            return h(bVar, ((Float) obj).floatValue(), z7);
        }
        if (obj instanceof Number) {
            return m(bVar, ((Number) obj).longValue(), z7);
        }
        if (obj instanceof Boolean) {
            return o(bVar, ((Boolean) obj).booleanValue(), z7);
        }
        if (!(obj instanceof byte[])) {
            A4.c cVar = (A4.c) this.f2082b.get(obj.getClass());
            if (cVar != null) {
                return r(cVar, bVar, obj, z7);
            }
            A4.e eVar = (A4.e) this.f2083c.get(obj.getClass());
            return eVar != null ? s(eVar, bVar, obj, z7) : obj instanceof c ? e(bVar, ((c) obj).e()) : obj instanceof Enum ? e(bVar, ((Enum) obj).ordinal()) : r(this.f2084d, bVar, obj, z7);
        }
        byte[] bArr = (byte[]) obj;
        if (z7 && bArr.length == 0) {
            return this;
        }
        x((v(bVar) << 3) | 2);
        x(bArr.length);
        this.f2081a.write(bArr);
        return this;
    }

    @Override // A4.d
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public f e(A4.b bVar, int i8) {
        return k(bVar, i8, true);
    }

    f k(A4.b bVar, int i8, boolean z7) {
        if (z7 && i8 == 0) {
            return this;
        }
        d u7 = u(bVar);
        int i9 = a.f2086a[u7.intEncoding().ordinal()];
        if (i9 == 1) {
            x(u7.tag() << 3);
            x(i8);
        } else if (i9 == 2) {
            x(u7.tag() << 3);
            x((i8 << 1) ^ (i8 >> 31));
        } else if (i9 == 3) {
            x((u7.tag() << 3) | 5);
            this.f2081a.write(p(4).putInt(i8).array());
        }
        return this;
    }

    @Override // A4.d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public f f(A4.b bVar, long j8) {
        return m(bVar, j8, true);
    }

    f m(A4.b bVar, long j8, boolean z7) {
        if (z7 && j8 == 0) {
            return this;
        }
        d u7 = u(bVar);
        int i8 = a.f2086a[u7.intEncoding().ordinal()];
        if (i8 == 1) {
            x(u7.tag() << 3);
            y(j8);
        } else if (i8 == 2) {
            x(u7.tag() << 3);
            y((j8 >> 63) ^ (j8 << 1));
        } else if (i8 == 3) {
            x((u7.tag() << 3) | 1);
            this.f2081a.write(p(8).putLong(j8).array());
        }
        return this;
    }

    @Override // A4.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public f g(A4.b bVar, boolean z7) {
        return o(bVar, z7, true);
    }

    f o(A4.b bVar, boolean z7, boolean z8) {
        return k(bVar, z7 ? 1 : 0, z8);
    }

    f t(Object obj) {
        if (obj == null) {
            return this;
        }
        A4.c cVar = (A4.c) this.f2082b.get(obj.getClass());
        if (cVar != null) {
            cVar.a(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }
}
