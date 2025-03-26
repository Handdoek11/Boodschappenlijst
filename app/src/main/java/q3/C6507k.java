package q3;

import A4.b;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.firebase.encoders.EncodingException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: q3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6507k implements A4.d {

    /* renamed from: f, reason: collision with root package name */
    private static final Charset f41761f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    private static final A4.b f41762g;

    /* renamed from: h, reason: collision with root package name */
    private static final A4.b f41763h;

    /* renamed from: i, reason: collision with root package name */
    private static final A4.c f41764i;

    /* renamed from: a, reason: collision with root package name */
    private OutputStream f41765a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f41766b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f41767c;

    /* renamed from: d, reason: collision with root package name */
    private final A4.c f41768d;

    /* renamed from: e, reason: collision with root package name */
    private final C6539o f41769e = new C6539o(this);

    static {
        b.C0000b a8 = A4.b.a("key");
        C6459e c6459e = new C6459e();
        c6459e.a(1);
        f41762g = a8.b(c6459e.b()).a();
        b.C0000b a9 = A4.b.a("value");
        C6459e c6459e2 = new C6459e();
        c6459e2.a(2);
        f41763h = a9.b(c6459e2.b()).a();
        f41764i = new A4.c() { // from class: q3.j
            @Override // A4.c
            public final void a(Object obj, Object obj2) {
                C6507k.l((Map.Entry) obj, (A4.d) obj2);
            }
        };
    }

    C6507k(OutputStream outputStream, Map map, Map map2, A4.c cVar) {
        this.f41765a = outputStream;
        this.f41766b = map;
        this.f41767c = map2;
        this.f41768d = cVar;
    }

    static /* synthetic */ void l(Map.Entry entry, A4.d dVar) {
        dVar.a(f41762g, entry.getKey());
        dVar.a(f41763h, entry.getValue());
    }

    private static int m(A4.b bVar) {
        InterfaceC6491i interfaceC6491i = (InterfaceC6491i) bVar.c(InterfaceC6491i.class);
        if (interfaceC6491i != null) {
            return interfaceC6491i.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private final long n(A4.c cVar, Object obj) {
        C6467f c6467f = new C6467f();
        try {
            OutputStream outputStream = this.f41765a;
            this.f41765a = c6467f;
            try {
                cVar.a(obj, this);
                this.f41765a = outputStream;
                long d8 = c6467f.d();
                c6467f.close();
                return d8;
            } catch (Throwable th) {
                this.f41765a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c6467f.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    private static InterfaceC6491i o(A4.b bVar) {
        InterfaceC6491i interfaceC6491i = (InterfaceC6491i) bVar.c(InterfaceC6491i.class);
        if (interfaceC6491i != null) {
            return interfaceC6491i;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private final C6507k p(A4.c cVar, A4.b bVar, Object obj, boolean z7) {
        long n8 = n(cVar, obj);
        if (z7 && n8 == 0) {
            return this;
        }
        s((m(bVar) << 3) | 2);
        t(n8);
        cVar.a(obj, this);
        return this;
    }

    private final C6507k q(A4.e eVar, A4.b bVar, Object obj, boolean z7) {
        this.f41769e.a(bVar, z7);
        eVar.a(obj, this.f41769e);
        return this;
    }

    private static ByteBuffer r(int i8) {
        return ByteBuffer.allocate(i8).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void s(int i8) {
        while ((i8 & (-128)) != 0) {
            this.f41765a.write((i8 & ModuleDescriptor.MODULE_VERSION) | 128);
            i8 >>>= 7;
        }
        this.f41765a.write(i8 & ModuleDescriptor.MODULE_VERSION);
    }

    private final void t(long j8) {
        while (((-128) & j8) != 0) {
            this.f41765a.write((((int) j8) & ModuleDescriptor.MODULE_VERSION) | 128);
            j8 >>>= 7;
        }
        this.f41765a.write(((int) j8) & ModuleDescriptor.MODULE_VERSION);
    }

    @Override // A4.d
    public final A4.d a(A4.b bVar, Object obj) {
        h(bVar, obj, true);
        return this;
    }

    final A4.d b(A4.b bVar, double d8, boolean z7) {
        if (z7 && d8 == 0.0d) {
            return this;
        }
        s((m(bVar) << 3) | 1);
        this.f41765a.write(r(8).putDouble(d8).array());
        return this;
    }

    @Override // A4.d
    public final A4.d c(A4.b bVar, double d8) {
        b(bVar, d8, true);
        return this;
    }

    final A4.d d(A4.b bVar, float f8, boolean z7) {
        if (z7 && f8 == 0.0f) {
            return this;
        }
        s((m(bVar) << 3) | 5);
        this.f41765a.write(r(4).putFloat(f8).array());
        return this;
    }

    @Override // A4.d
    public final /* synthetic */ A4.d e(A4.b bVar, int i8) {
        i(bVar, i8, true);
        return this;
    }

    @Override // A4.d
    public final /* synthetic */ A4.d f(A4.b bVar, long j8) {
        j(bVar, j8, true);
        return this;
    }

    @Override // A4.d
    public final /* synthetic */ A4.d g(A4.b bVar, boolean z7) {
        i(bVar, z7 ? 1 : 0, true);
        return this;
    }

    final A4.d h(A4.b bVar, Object obj, boolean z7) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z7 && charSequence.length() == 0) {
                return this;
            }
            s((m(bVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f41761f);
            s(bytes.length);
            this.f41765a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                h(bVar, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                p(f41764i, bVar, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            b(bVar, ((Double) obj).doubleValue(), z7);
            return this;
        }
        if (obj instanceof Float) {
            d(bVar, ((Float) obj).floatValue(), z7);
            return this;
        }
        if (obj instanceof Number) {
            j(bVar, ((Number) obj).longValue(), z7);
            return this;
        }
        if (obj instanceof Boolean) {
            i(bVar, ((Boolean) obj).booleanValue() ? 1 : 0, z7);
            return this;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z7 && bArr.length == 0) {
                return this;
            }
            s((m(bVar) << 3) | 2);
            s(bArr.length);
            this.f41765a.write(bArr);
            return this;
        }
        A4.c cVar = (A4.c) this.f41766b.get(obj.getClass());
        if (cVar != null) {
            p(cVar, bVar, obj, z7);
            return this;
        }
        A4.e eVar = (A4.e) this.f41767c.get(obj.getClass());
        if (eVar != null) {
            q(eVar, bVar, obj, z7);
            return this;
        }
        if (obj instanceof InterfaceC6475g) {
            i(bVar, ((InterfaceC6475g) obj).zza(), true);
            return this;
        }
        if (obj instanceof Enum) {
            i(bVar, ((Enum) obj).ordinal(), true);
            return this;
        }
        p(this.f41768d, bVar, obj, z7);
        return this;
    }

    final C6507k i(A4.b bVar, int i8, boolean z7) {
        if (z7 && i8 == 0) {
            return this;
        }
        InterfaceC6491i o8 = o(bVar);
        EnumC6483h enumC6483h = EnumC6483h.DEFAULT;
        int ordinal = o8.zzb().ordinal();
        if (ordinal == 0) {
            s(o8.zza() << 3);
            s(i8);
        } else if (ordinal == 1) {
            s(o8.zza() << 3);
            s((i8 + i8) ^ (i8 >> 31));
        } else if (ordinal == 2) {
            s((o8.zza() << 3) | 5);
            this.f41765a.write(r(4).putInt(i8).array());
        }
        return this;
    }

    final C6507k j(A4.b bVar, long j8, boolean z7) {
        if (z7 && j8 == 0) {
            return this;
        }
        InterfaceC6491i o8 = o(bVar);
        EnumC6483h enumC6483h = EnumC6483h.DEFAULT;
        int ordinal = o8.zzb().ordinal();
        if (ordinal == 0) {
            s(o8.zza() << 3);
            t(j8);
        } else if (ordinal == 1) {
            s(o8.zza() << 3);
            t((j8 >> 63) ^ (j8 + j8));
        } else if (ordinal == 2) {
            s((o8.zza() << 3) | 1);
            this.f41765a.write(r(8).putLong(j8).array());
        }
        return this;
    }

    final C6507k k(Object obj) {
        if (obj == null) {
            return this;
        }
        A4.c cVar = (A4.c) this.f41766b.get(obj.getClass());
        if (cVar == null) {
            throw new EncodingException("No encoder for ".concat(String.valueOf(obj.getClass())));
        }
        cVar.a(obj, this);
        return this;
    }
}
