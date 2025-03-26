package C4;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class e implements A4.d, A4.f {

    /* renamed from: a, reason: collision with root package name */
    private e f1077a = null;

    /* renamed from: b, reason: collision with root package name */
    private boolean f1078b = true;

    /* renamed from: c, reason: collision with root package name */
    private final JsonWriter f1079c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f1080d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f1081e;

    /* renamed from: f, reason: collision with root package name */
    private final A4.c f1082f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f1083g;

    e(Writer writer, Map map, Map map2, A4.c cVar, boolean z7) {
        this.f1079c = new JsonWriter(writer);
        this.f1080d = map;
        this.f1081e = map2;
        this.f1082f = cVar;
        this.f1083g = z7;
    }

    private boolean t(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private e w(String str, Object obj) {
        y();
        this.f1079c.name(str);
        if (obj != null) {
            return k(obj, false);
        }
        this.f1079c.nullValue();
        return this;
    }

    private e x(String str, Object obj) {
        if (obj == null) {
            return this;
        }
        y();
        this.f1079c.name(str);
        return k(obj, false);
    }

    private void y() {
        if (!this.f1078b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        e eVar = this.f1077a;
        if (eVar != null) {
            eVar.y();
            this.f1077a.f1078b = false;
            this.f1077a = null;
            this.f1079c.endObject();
        }
    }

    @Override // A4.d
    public A4.d a(A4.b bVar, Object obj) {
        return p(bVar.b(), obj);
    }

    @Override // A4.d
    public A4.d c(A4.b bVar, double d8) {
        return m(bVar.b(), d8);
    }

    @Override // A4.d
    public A4.d e(A4.b bVar, int i8) {
        return n(bVar.b(), i8);
    }

    @Override // A4.d
    public A4.d f(A4.b bVar, long j8) {
        return o(bVar.b(), j8);
    }

    @Override // A4.d
    public A4.d g(A4.b bVar, boolean z7) {
        return q(bVar.b(), z7);
    }

    public e h(double d8) {
        y();
        this.f1079c.value(d8);
        return this;
    }

    public e i(int i8) {
        y();
        this.f1079c.value(i8);
        return this;
    }

    public e j(long j8) {
        y();
        this.f1079c.value(j8);
        return this;
    }

    e k(Object obj, boolean z7) {
        int i8 = 0;
        if (z7 && t(obj)) {
            throw new EncodingException(String.format("%s cannot be encoded inline", obj == null ? null : obj.getClass()));
        }
        if (obj == null) {
            this.f1079c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f1079c.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f1079c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    k(it.next(), false);
                }
                this.f1079c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f1079c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        p((String) key, entry.getValue());
                    } catch (ClassCastException e8) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e8);
                    }
                }
                this.f1079c.endObject();
                return this;
            }
            A4.c cVar = (A4.c) this.f1080d.get(obj.getClass());
            if (cVar != null) {
                return v(cVar, obj, z7);
            }
            A4.e eVar = (A4.e) this.f1081e.get(obj.getClass());
            if (eVar != null) {
                eVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return v(this.f1082f, obj, z7);
            }
            if (obj instanceof f) {
                i(((f) obj).e());
            } else {
                b(((Enum) obj).name());
            }
            return this;
        }
        if (obj instanceof byte[]) {
            return s((byte[]) obj);
        }
        this.f1079c.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i8 < length) {
                this.f1079c.value(r7[i8]);
                i8++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i8 < length2) {
                j(jArr[i8]);
                i8++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i8 < length3) {
                this.f1079c.value(dArr[i8]);
                i8++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i8 < length4) {
                this.f1079c.value(zArr[i8]);
                i8++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                k(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                k(obj2, false);
            }
        }
        this.f1079c.endArray();
        return this;
    }

    @Override // A4.f
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public e b(String str) {
        y();
        this.f1079c.value(str);
        return this;
    }

    public e m(String str, double d8) {
        y();
        this.f1079c.name(str);
        return h(d8);
    }

    public e n(String str, int i8) {
        y();
        this.f1079c.name(str);
        return i(i8);
    }

    public e o(String str, long j8) {
        y();
        this.f1079c.name(str);
        return j(j8);
    }

    public e p(String str, Object obj) {
        return this.f1083g ? x(str, obj) : w(str, obj);
    }

    public e q(String str, boolean z7) {
        y();
        this.f1079c.name(str);
        return d(z7);
    }

    @Override // A4.f
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public e d(boolean z7) {
        y();
        this.f1079c.value(z7);
        return this;
    }

    public e s(byte[] bArr) {
        y();
        if (bArr == null) {
            this.f1079c.nullValue();
        } else {
            this.f1079c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    void u() {
        y();
        this.f1079c.flush();
    }

    e v(A4.c cVar, Object obj, boolean z7) {
        if (!z7) {
            this.f1079c.beginObject();
        }
        cVar.a(obj, this);
        if (!z7) {
            this.f1079c.endObject();
        }
        return this;
    }
}
