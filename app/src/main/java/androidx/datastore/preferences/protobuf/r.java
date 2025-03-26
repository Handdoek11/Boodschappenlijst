package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.o0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class r {

    /* renamed from: d, reason: collision with root package name */
    private static final r f9505d = new r(true);

    /* renamed from: a, reason: collision with root package name */
    private final f0 f9506a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f9507b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9508c;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9509a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f9510b;

        static {
            int[] iArr = new int[o0.b.values().length];
            f9510b = iArr;
            try {
                iArr[o0.b.f9480t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9510b[o0.b.f9481u.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9510b[o0.b.f9482v.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9510b[o0.b.f9483w.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9510b[o0.b.f9484x.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9510b[o0.b.f9485y.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9510b[o0.b.f9486z.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9510b[o0.b.f9468A.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9510b[o0.b.f9470C.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9510b[o0.b.f9471D.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9510b[o0.b.f9469B.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9510b[o0.b.f9472E.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f9510b[o0.b.f9473F.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f9510b[o0.b.f9475H.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f9510b[o0.b.f9476I.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f9510b[o0.b.f9477J.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f9510b[o0.b.f9478K.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f9510b[o0.b.f9474G.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[o0.c.values().length];
            f9509a = iArr2;
            try {
                iArr2[o0.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f9509a[o0.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f9509a[o0.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f9509a[o0.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f9509a[o0.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f9509a[o0.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f9509a[o0.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f9509a[o0.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f9509a[o0.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public interface b extends Comparable {
        int e();

        boolean j();

        o0.b n();

        boolean o();
    }

    private r() {
        this.f9506a = f0.r(16);
    }

    static int b(o0.b bVar, int i8, Object obj) {
        int P7 = CodedOutputStream.P(i8);
        if (bVar == o0.b.f9470C) {
            P7 *= 2;
        }
        return P7 + c(bVar, obj);
    }

    static int c(o0.b bVar, Object obj) {
        switch (a.f9510b[bVar.ordinal()]) {
            case 1:
                return CodedOutputStream.i(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.q(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.x(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.T(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.v(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.o(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.m(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.d(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.s((M) obj);
            case 10:
                return CodedOutputStream.A((M) obj);
            case 11:
                return obj instanceof AbstractC0883g ? CodedOutputStream.g((AbstractC0883g) obj) : CodedOutputStream.O((String) obj);
            case 12:
                return obj instanceof AbstractC0883g ? CodedOutputStream.g((AbstractC0883g) obj) : CodedOutputStream.e((byte[]) obj);
            case 13:
                return CodedOutputStream.R(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.G(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.I(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.K(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.M(((Long) obj).longValue());
            case 18:
                return CodedOutputStream.k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(b bVar, Object obj) {
        o0.b n8 = bVar.n();
        int e8 = bVar.e();
        if (!bVar.j()) {
            return b(n8, e8, obj);
        }
        int i8 = 0;
        if (bVar.o()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                i8 += c(n8, it.next());
            }
            return CodedOutputStream.P(e8) + i8 + CodedOutputStream.E(i8);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            i8 += b(n8, e8, it2.next());
        }
        return i8;
    }

    private int g(Map.Entry entry) {
        androidx.appcompat.app.E.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    static int i(o0.b bVar, boolean z7) {
        if (z7) {
            return 2;
        }
        return bVar.c();
    }

    private static boolean l(Map.Entry entry) {
        androidx.appcompat.app.E.a(entry.getKey());
        throw null;
    }

    private static boolean m(o0.b bVar, Object obj) {
        AbstractC0899x.a(obj);
        switch (a.f9509a[bVar.a().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof AbstractC0883g) || (obj instanceof byte[]);
            case 8:
                return obj instanceof Integer;
            case 9:
                return obj instanceof M;
            default:
                return false;
        }
    }

    private void q(Map.Entry entry) {
        androidx.appcompat.app.E.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    public static r r() {
        return new r();
    }

    private void t(o0.b bVar, Object obj) {
        if (!m(bVar, obj)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    static void u(CodedOutputStream codedOutputStream, o0.b bVar, int i8, Object obj) {
        if (bVar == o0.b.f9470C) {
            codedOutputStream.r0(i8, (M) obj);
        } else {
            codedOutputStream.N0(i8, i(bVar, false));
            v(codedOutputStream, bVar, obj);
        }
    }

    static void v(CodedOutputStream codedOutputStream, o0.b bVar, Object obj) {
        switch (a.f9510b[bVar.ordinal()]) {
            case 1:
                codedOutputStream.i0(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.q0(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.y0(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.R0(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.w0(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.o0(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.m0(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.c0(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.t0((M) obj);
                break;
            case 10:
                codedOutputStream.A0((M) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC0883g)) {
                    codedOutputStream.M0((String) obj);
                    break;
                } else {
                    codedOutputStream.g0((AbstractC0883g) obj);
                    break;
                }
            case 12:
                if (!(obj instanceof AbstractC0883g)) {
                    codedOutputStream.d0((byte[]) obj);
                    break;
                } else {
                    codedOutputStream.g0((AbstractC0883g) obj);
                    break;
                }
            case 13:
                codedOutputStream.P0(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.E0(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.G0(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.I0(((Integer) obj).intValue());
                break;
            case 17:
                codedOutputStream.K0(((Long) obj).longValue());
                break;
            case 18:
                codedOutputStream.k0(((Integer) obj).intValue());
                break;
        }
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public r clone() {
        r r8 = r();
        for (int i8 = 0; i8 < this.f9506a.l(); i8++) {
            Map.Entry k8 = this.f9506a.k(i8);
            androidx.appcompat.app.E.a(k8.getKey());
            r8.s(null, k8.getValue());
        }
        for (Map.Entry entry : this.f9506a.n()) {
            androidx.appcompat.app.E.a(entry.getKey());
            r8.s(null, entry.getValue());
        }
        r8.f9508c = this.f9508c;
        return r8;
    }

    Iterator e() {
        return this.f9508c ? new C0901z(this.f9506a.i().iterator()) : this.f9506a.i().iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            return this.f9506a.equals(((r) obj).f9506a);
        }
        return false;
    }

    public int f() {
        int i8 = 0;
        for (int i9 = 0; i9 < this.f9506a.l(); i9++) {
            i8 += g(this.f9506a.k(i9));
        }
        Iterator it = this.f9506a.n().iterator();
        while (it.hasNext()) {
            i8 += g((Map.Entry) it.next());
        }
        return i8;
    }

    public int h() {
        int i8 = 0;
        for (int i9 = 0; i9 < this.f9506a.l(); i9++) {
            Map.Entry k8 = this.f9506a.k(i9);
            androidx.appcompat.app.E.a(k8.getKey());
            i8 += d(null, k8.getValue());
        }
        for (Map.Entry entry : this.f9506a.n()) {
            androidx.appcompat.app.E.a(entry.getKey());
            i8 += d(null, entry.getValue());
        }
        return i8;
    }

    public int hashCode() {
        return this.f9506a.hashCode();
    }

    boolean j() {
        return this.f9506a.isEmpty();
    }

    public boolean k() {
        for (int i8 = 0; i8 < this.f9506a.l(); i8++) {
            if (!l(this.f9506a.k(i8))) {
                return false;
            }
        }
        Iterator it = this.f9506a.n().iterator();
        while (it.hasNext()) {
            if (!l((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator n() {
        return this.f9508c ? new C0901z(this.f9506a.entrySet().iterator()) : this.f9506a.entrySet().iterator();
    }

    public void o() {
        if (this.f9507b) {
            return;
        }
        this.f9506a.q();
        this.f9507b = true;
    }

    public void p(r rVar) {
        for (int i8 = 0; i8 < rVar.f9506a.l(); i8++) {
            q(rVar.f9506a.k(i8));
        }
        Iterator it = rVar.f9506a.n().iterator();
        while (it.hasNext()) {
            q((Map.Entry) it.next());
        }
    }

    public void s(b bVar, Object obj) {
        if (!bVar.j()) {
            t(bVar.n(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                t(bVar.n(), it.next());
            }
            obj = arrayList;
        }
        this.f9506a.s(bVar, obj);
    }

    private r(boolean z7) {
        this(f0.r(0));
        o();
    }

    private r(f0 f0Var) {
        this.f9506a = f0Var;
        o();
    }
}
