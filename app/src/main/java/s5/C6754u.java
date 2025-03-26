package s5;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d;
import com.google.protobuf.g;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s5.C6755v;

/* renamed from: s5.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6754u extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: L, reason: collision with root package name */
    private static final C6754u f43579L;

    /* renamed from: M, reason: collision with root package name */
    public static com.google.protobuf.n f43580M = new a();

    /* renamed from: A, reason: collision with root package name */
    private boolean f43581A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f43582B;

    /* renamed from: C, reason: collision with root package name */
    private List f43583C;

    /* renamed from: D, reason: collision with root package name */
    private List f43584D;

    /* renamed from: E, reason: collision with root package name */
    private List f43585E;

    /* renamed from: F, reason: collision with root package name */
    private List f43586F;

    /* renamed from: G, reason: collision with root package name */
    private List f43587G;

    /* renamed from: H, reason: collision with root package name */
    private List f43588H;

    /* renamed from: I, reason: collision with root package name */
    private C6755v f43589I;

    /* renamed from: J, reason: collision with root package name */
    private int f43590J;

    /* renamed from: K, reason: collision with root package name */
    private int f43591K;

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f43592s;

    /* renamed from: t, reason: collision with root package name */
    private int f43593t;

    /* renamed from: u, reason: collision with root package name */
    private Object f43594u;

    /* renamed from: v, reason: collision with root package name */
    private Object f43595v;

    /* renamed from: w, reason: collision with root package name */
    private long f43596w;

    /* renamed from: x, reason: collision with root package name */
    private List f43597x;

    /* renamed from: y, reason: collision with root package name */
    private List f43598y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f43599z;

    /* renamed from: s5.u$a */
    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public C6754u d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new C6754u(eVar, fVar);
        }
    }

    static {
        C6754u c6754u = new C6754u(true);
        f43579L = c6754u;
        c6754u.d0();
    }

    public static C6754u J() {
        return f43579L;
    }

    private void d0() {
        this.f43594u = "";
        this.f43595v = "";
        this.f43596w = 0L;
        this.f43597x = Collections.emptyList();
        this.f43598y = Collections.emptyList();
        this.f43599z = false;
        this.f43581A = false;
        this.f43582B = false;
        this.f43583C = Collections.emptyList();
        this.f43584D = Collections.emptyList();
        this.f43585E = Collections.emptyList();
        this.f43586F = Collections.emptyList();
        this.f43587G = Collections.emptyList();
        this.f43588H = Collections.emptyList();
        this.f43589I = C6755v.r();
    }

    public static b e0() {
        return b.q();
    }

    public static b f0(C6754u c6754u) {
        return e0().C(c6754u);
    }

    public C6755v K() {
        return this.f43589I;
    }

    public boolean L() {
        return this.f43599z;
    }

    public long M() {
        return this.f43596w;
    }

    public List N() {
        return this.f43584D;
    }

    public List O() {
        return this.f43587G;
    }

    public List P() {
        return this.f43588H;
    }

    public List Q() {
        return this.f43585E;
    }

    public List R() {
        return this.f43586F;
    }

    public boolean S() {
        return this.f43582B;
    }

    public boolean T() {
        return this.f43581A;
    }

    public com.google.protobuf.d U() {
        Object obj = this.f43595v;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43595v = n8;
        return n8;
    }

    public com.google.protobuf.d V() {
        Object obj = this.f43594u;
        if (!(obj instanceof String)) {
            return (com.google.protobuf.d) obj;
        }
        com.google.protobuf.d n8 = com.google.protobuf.d.n((String) obj);
        this.f43594u = n8;
        return n8;
    }

    public boolean W() {
        return (this.f43593t & 64) == 64;
    }

    public boolean X() {
        return (this.f43593t & 8) == 8;
    }

    public boolean Y() {
        return (this.f43593t & 4) == 4;
    }

    public boolean Z() {
        return (this.f43593t & 32) == 32;
    }

    public boolean a0() {
        return (this.f43593t & 16) == 16;
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f43591K;
        if (i8 != -1) {
            return i8;
        }
        int d8 = (this.f43593t & 1) == 1 ? CodedOutputStream.d(1, V()) : 0;
        if ((this.f43593t & 2) == 2) {
            d8 += CodedOutputStream.d(2, U());
        }
        if ((this.f43593t & 4) == 4) {
            d8 += CodedOutputStream.j(3, this.f43596w);
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f43597x.size(); i10++) {
            i9 += CodedOutputStream.g(((EnumC6743i) this.f43597x.get(i10)).e());
        }
        int size = d8 + i9 + this.f43597x.size();
        if ((this.f43593t & 8) == 8) {
            size += CodedOutputStream.b(5, this.f43599z);
        }
        if ((this.f43593t & 16) == 16) {
            size += CodedOutputStream.b(6, this.f43581A);
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f43598y.size(); i12++) {
            i11 += CodedOutputStream.g(((EnumC6743i) this.f43598y.get(i12)).e());
        }
        int size2 = size + i11 + this.f43598y.size();
        if ((this.f43593t & 32) == 32) {
            size2 += CodedOutputStream.b(8, this.f43582B);
        }
        for (int i13 = 0; i13 < this.f43583C.size(); i13++) {
            size2 += CodedOutputStream.l(9, (com.google.protobuf.l) this.f43583C.get(i13));
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f43584D.size(); i15++) {
            i14 += CodedOutputStream.g(((EnumC6743i) this.f43584D.get(i15)).e());
        }
        int size3 = size2 + i14 + this.f43584D.size();
        int i16 = 0;
        for (int i17 = 0; i17 < this.f43585E.size(); i17++) {
            i16 += CodedOutputStream.g(((EnumC6743i) this.f43585E.get(i17)).e());
        }
        int size4 = size3 + i16 + this.f43585E.size();
        int i18 = 0;
        for (int i19 = 0; i19 < this.f43586F.size(); i19++) {
            i18 += CodedOutputStream.g(((EnumC6743i) this.f43586F.get(i19)).e());
        }
        int size5 = size4 + i18 + this.f43586F.size();
        int i20 = 0;
        for (int i21 = 0; i21 < this.f43587G.size(); i21++) {
            i20 += CodedOutputStream.g(((EnumC6743i) this.f43587G.get(i21)).e());
        }
        int size6 = size5 + i20 + this.f43587G.size();
        int i22 = 0;
        for (int i23 = 0; i23 < this.f43588H.size(); i23++) {
            i22 += CodedOutputStream.g(((EnumC6743i) this.f43588H.get(i23)).e());
        }
        int size7 = size6 + i22 + this.f43588H.size();
        if ((this.f43593t & 64) == 64) {
            size7 += CodedOutputStream.l(15, this.f43589I);
        }
        int size8 = size7 + this.f43592s.size();
        this.f43591K = size8;
        return size8;
    }

    public boolean b0() {
        return (this.f43593t & 2) == 2;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        int i8 = this.f43590J;
        if (i8 == 1) {
            return true;
        }
        if (i8 == 0) {
            return false;
        }
        this.f43590J = 1;
        return true;
    }

    public boolean c0() {
        return (this.f43593t & 1) == 1;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        if ((this.f43593t & 1) == 1) {
            codedOutputStream.E(1, V());
        }
        if ((this.f43593t & 2) == 2) {
            codedOutputStream.E(2, U());
        }
        if ((this.f43593t & 4) == 4) {
            codedOutputStream.M(3, this.f43596w);
        }
        for (int i8 = 0; i8 < this.f43597x.size(); i8++) {
            codedOutputStream.G(4, ((EnumC6743i) this.f43597x.get(i8)).e());
        }
        if ((this.f43593t & 8) == 8) {
            codedOutputStream.C(5, this.f43599z);
        }
        if ((this.f43593t & 16) == 16) {
            codedOutputStream.C(6, this.f43581A);
        }
        for (int i9 = 0; i9 < this.f43598y.size(); i9++) {
            codedOutputStream.G(7, ((EnumC6743i) this.f43598y.get(i9)).e());
        }
        if ((this.f43593t & 32) == 32) {
            codedOutputStream.C(8, this.f43582B);
        }
        for (int i10 = 0; i10 < this.f43583C.size(); i10++) {
            codedOutputStream.O(9, (com.google.protobuf.l) this.f43583C.get(i10));
        }
        for (int i11 = 0; i11 < this.f43584D.size(); i11++) {
            codedOutputStream.G(10, ((EnumC6743i) this.f43584D.get(i11)).e());
        }
        for (int i12 = 0; i12 < this.f43585E.size(); i12++) {
            codedOutputStream.G(11, ((EnumC6743i) this.f43585E.get(i12)).e());
        }
        for (int i13 = 0; i13 < this.f43586F.size(); i13++) {
            codedOutputStream.G(12, ((EnumC6743i) this.f43586F.get(i13)).e());
        }
        for (int i14 = 0; i14 < this.f43587G.size(); i14++) {
            codedOutputStream.G(13, ((EnumC6743i) this.f43587G.get(i14)).e());
        }
        for (int i15 = 0; i15 < this.f43588H.size(); i15++) {
            codedOutputStream.G(14, ((EnumC6743i) this.f43588H.get(i15)).e());
        }
        if ((this.f43593t & 64) == 64) {
            codedOutputStream.O(15, this.f43589I);
        }
        codedOutputStream.S(this.f43592s);
    }

    public b g0() {
        return f0(this);
    }

    private C6754u(g.a aVar) {
        super(aVar);
        this.f43590J = -1;
        this.f43591K = -1;
        this.f43592s = aVar.i();
    }

    private C6754u(boolean z7) {
        this.f43590J = -1;
        this.f43591K = -1;
        this.f43592s = com.google.protobuf.d.f33078o;
    }

    private C6754u(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f43590J = -1;
        this.f43591K = -1;
        d0();
        d.b t7 = com.google.protobuf.d.t();
        CodedOutputStream w7 = CodedOutputStream.w(t7);
        boolean z7 = false;
        int i8 = 0;
        while (!z7) {
            try {
                try {
                    try {
                        int x7 = eVar.x();
                        switch (x7) {
                            case 0:
                                z7 = true;
                            case 10:
                                com.google.protobuf.d j8 = eVar.j();
                                this.f43593t |= 1;
                                this.f43594u = j8;
                            case 18:
                                com.google.protobuf.d j9 = eVar.j();
                                this.f43593t |= 2;
                                this.f43595v = j9;
                            case 24:
                                this.f43593t |= 4;
                                this.f43596w = eVar.m();
                            case 32:
                                int k8 = eVar.k();
                                EnumC6743i c8 = EnumC6743i.c(k8);
                                if (c8 == null) {
                                    w7.W(x7);
                                    w7.W(k8);
                                } else {
                                    if ((i8 & 8) != 8) {
                                        this.f43597x = new ArrayList();
                                        i8 |= 8;
                                    }
                                    this.f43597x.add(c8);
                                }
                            case 34:
                                int h8 = eVar.h(eVar.s());
                                while (eVar.c() > 0) {
                                    int k9 = eVar.k();
                                    EnumC6743i c9 = EnumC6743i.c(k9);
                                    if (c9 == null) {
                                        w7.W(x7);
                                        w7.W(k9);
                                    } else {
                                        if ((i8 & 8) != 8) {
                                            this.f43597x = new ArrayList();
                                            i8 |= 8;
                                        }
                                        this.f43597x.add(c9);
                                    }
                                }
                                eVar.g(h8);
                            case 40:
                                this.f43593t |= 8;
                                this.f43599z = eVar.i();
                            case 48:
                                this.f43593t |= 16;
                                this.f43581A = eVar.i();
                            case 56:
                                int k10 = eVar.k();
                                EnumC6743i c10 = EnumC6743i.c(k10);
                                if (c10 == null) {
                                    w7.W(x7);
                                    w7.W(k10);
                                } else {
                                    if ((i8 & 16) != 16) {
                                        this.f43598y = new ArrayList();
                                        i8 |= 16;
                                    }
                                    this.f43598y.add(c10);
                                }
                            case 58:
                                int h9 = eVar.h(eVar.s());
                                while (eVar.c() > 0) {
                                    int k11 = eVar.k();
                                    EnumC6743i c11 = EnumC6743i.c(k11);
                                    if (c11 == null) {
                                        w7.W(x7);
                                        w7.W(k11);
                                    } else {
                                        if ((i8 & 16) != 16) {
                                            this.f43598y = new ArrayList();
                                            i8 |= 16;
                                        }
                                        this.f43598y.add(c11);
                                    }
                                }
                                eVar.g(h9);
                            case 64:
                                this.f43593t |= 32;
                                this.f43582B = eVar.i();
                            case 74:
                                if ((i8 & 256) != 256) {
                                    this.f43583C = new ArrayList();
                                    i8 |= 256;
                                }
                                this.f43583C.add((B) eVar.n(B.f42754z, fVar));
                            case 80:
                                int k12 = eVar.k();
                                EnumC6743i c12 = EnumC6743i.c(k12);
                                if (c12 == null) {
                                    w7.W(x7);
                                    w7.W(k12);
                                } else {
                                    if ((i8 & 512) != 512) {
                                        this.f43584D = new ArrayList();
                                        i8 |= 512;
                                    }
                                    this.f43584D.add(c12);
                                }
                            case 82:
                                int h10 = eVar.h(eVar.s());
                                while (eVar.c() > 0) {
                                    int k13 = eVar.k();
                                    EnumC6743i c13 = EnumC6743i.c(k13);
                                    if (c13 == null) {
                                        w7.W(x7);
                                        w7.W(k13);
                                    } else {
                                        if ((i8 & 512) != 512) {
                                            this.f43584D = new ArrayList();
                                            i8 |= 512;
                                        }
                                        this.f43584D.add(c13);
                                    }
                                }
                                eVar.g(h10);
                            case 88:
                                int k14 = eVar.k();
                                EnumC6743i c14 = EnumC6743i.c(k14);
                                if (c14 == null) {
                                    w7.W(x7);
                                    w7.W(k14);
                                } else {
                                    if ((i8 & 1024) != 1024) {
                                        this.f43585E = new ArrayList();
                                        i8 |= 1024;
                                    }
                                    this.f43585E.add(c14);
                                }
                            case 90:
                                int h11 = eVar.h(eVar.s());
                                while (eVar.c() > 0) {
                                    int k15 = eVar.k();
                                    EnumC6743i c15 = EnumC6743i.c(k15);
                                    if (c15 == null) {
                                        w7.W(x7);
                                        w7.W(k15);
                                    } else {
                                        if ((i8 & 1024) != 1024) {
                                            this.f43585E = new ArrayList();
                                            i8 |= 1024;
                                        }
                                        this.f43585E.add(c15);
                                    }
                                }
                                eVar.g(h11);
                            case 96:
                                int k16 = eVar.k();
                                EnumC6743i c16 = EnumC6743i.c(k16);
                                if (c16 == null) {
                                    w7.W(x7);
                                    w7.W(k16);
                                } else {
                                    if ((i8 & 2048) != 2048) {
                                        this.f43586F = new ArrayList();
                                        i8 |= 2048;
                                    }
                                    this.f43586F.add(c16);
                                }
                            case 98:
                                int h12 = eVar.h(eVar.s());
                                while (eVar.c() > 0) {
                                    int k17 = eVar.k();
                                    EnumC6743i c17 = EnumC6743i.c(k17);
                                    if (c17 == null) {
                                        w7.W(x7);
                                        w7.W(k17);
                                    } else {
                                        if ((i8 & 2048) != 2048) {
                                            this.f43586F = new ArrayList();
                                            i8 |= 2048;
                                        }
                                        this.f43586F.add(c17);
                                    }
                                }
                                eVar.g(h12);
                            case 104:
                                int k18 = eVar.k();
                                EnumC6743i c18 = EnumC6743i.c(k18);
                                if (c18 == null) {
                                    w7.W(x7);
                                    w7.W(k18);
                                } else {
                                    if ((i8 & 4096) != 4096) {
                                        this.f43587G = new ArrayList();
                                        i8 |= 4096;
                                    }
                                    this.f43587G.add(c18);
                                }
                            case 106:
                                int h13 = eVar.h(eVar.s());
                                while (eVar.c() > 0) {
                                    int k19 = eVar.k();
                                    EnumC6743i c19 = EnumC6743i.c(k19);
                                    if (c19 == null) {
                                        w7.W(x7);
                                        w7.W(k19);
                                    } else {
                                        if ((i8 & 4096) != 4096) {
                                            this.f43587G = new ArrayList();
                                            i8 |= 4096;
                                        }
                                        this.f43587G.add(c19);
                                    }
                                }
                                eVar.g(h13);
                            case 112:
                                int k20 = eVar.k();
                                EnumC6743i c20 = EnumC6743i.c(k20);
                                if (c20 == null) {
                                    w7.W(x7);
                                    w7.W(k20);
                                } else {
                                    if ((i8 & 8192) != 8192) {
                                        this.f43588H = new ArrayList();
                                        i8 |= 8192;
                                    }
                                    this.f43588H.add(c20);
                                }
                            case 114:
                                int h14 = eVar.h(eVar.s());
                                while (eVar.c() > 0) {
                                    int k21 = eVar.k();
                                    EnumC6743i c21 = EnumC6743i.c(k21);
                                    if (c21 == null) {
                                        w7.W(x7);
                                        w7.W(k21);
                                    } else {
                                        if ((i8 & 8192) != 8192) {
                                            this.f43588H = new ArrayList();
                                            i8 |= 8192;
                                        }
                                        this.f43588H.add(c21);
                                    }
                                }
                                eVar.g(h14);
                            case 122:
                                C6755v.b C7 = (this.f43593t & 64) == 64 ? this.f43589I.C() : null;
                                C6755v c6755v = (C6755v) eVar.n(C6755v.f43621A, fVar);
                                this.f43589I = c6755v;
                                if (C7 != null) {
                                    C7.s(c6755v);
                                    this.f43589I = C7.m();
                                }
                                this.f43593t |= 64;
                            default:
                                if (!h(eVar, w7, fVar, x7)) {
                                    z7 = true;
                                }
                        }
                    } catch (IOException e8) {
                        throw new InvalidProtocolBufferException(e8.getMessage()).g(this);
                    }
                } catch (InvalidProtocolBufferException e9) {
                    throw e9.g(this);
                }
            } catch (Throwable th) {
                if ((i8 & 8) == 8) {
                    this.f43597x = DesugarCollections.unmodifiableList(this.f43597x);
                }
                if ((i8 & 16) == 16) {
                    this.f43598y = DesugarCollections.unmodifiableList(this.f43598y);
                }
                if ((i8 & 256) == 256) {
                    this.f43583C = DesugarCollections.unmodifiableList(this.f43583C);
                }
                if ((i8 & 512) == 512) {
                    this.f43584D = DesugarCollections.unmodifiableList(this.f43584D);
                }
                if ((i8 & 1024) == 1024) {
                    this.f43585E = DesugarCollections.unmodifiableList(this.f43585E);
                }
                if ((i8 & 2048) == 2048) {
                    this.f43586F = DesugarCollections.unmodifiableList(this.f43586F);
                }
                if ((i8 & 4096) == 4096) {
                    this.f43587G = DesugarCollections.unmodifiableList(this.f43587G);
                }
                if ((i8 & 8192) == 8192) {
                    this.f43588H = DesugarCollections.unmodifiableList(this.f43588H);
                }
                try {
                    w7.v();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f43592s = t7.h();
                    throw th2;
                }
                this.f43592s = t7.h();
                g();
                throw th;
            }
        }
        if ((i8 & 8) == 8) {
            this.f43597x = DesugarCollections.unmodifiableList(this.f43597x);
        }
        if ((i8 & 16) == 16) {
            this.f43598y = DesugarCollections.unmodifiableList(this.f43598y);
        }
        if ((i8 & 256) == 256) {
            this.f43583C = DesugarCollections.unmodifiableList(this.f43583C);
        }
        if ((i8 & 512) == 512) {
            this.f43584D = DesugarCollections.unmodifiableList(this.f43584D);
        }
        if ((i8 & 1024) == 1024) {
            this.f43585E = DesugarCollections.unmodifiableList(this.f43585E);
        }
        if ((i8 & 2048) == 2048) {
            this.f43586F = DesugarCollections.unmodifiableList(this.f43586F);
        }
        if ((i8 & 4096) == 4096) {
            this.f43587G = DesugarCollections.unmodifiableList(this.f43587G);
        }
        if ((i8 & 8192) == 8192) {
            this.f43588H = DesugarCollections.unmodifiableList(this.f43588H);
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f43592s = t7.h();
            throw th3;
        }
        this.f43592s = t7.h();
        g();
    }

    /* renamed from: s5.u$b */
    public static final class b extends g.a implements com.google.protobuf.m {

        /* renamed from: A, reason: collision with root package name */
        private boolean f43600A;

        /* renamed from: s, reason: collision with root package name */
        private int f43608s;

        /* renamed from: v, reason: collision with root package name */
        private long f43611v;

        /* renamed from: y, reason: collision with root package name */
        private boolean f43614y;

        /* renamed from: z, reason: collision with root package name */
        private boolean f43615z;

        /* renamed from: t, reason: collision with root package name */
        private Object f43609t = "";

        /* renamed from: u, reason: collision with root package name */
        private Object f43610u = "";

        /* renamed from: w, reason: collision with root package name */
        private List f43612w = Collections.emptyList();

        /* renamed from: x, reason: collision with root package name */
        private List f43613x = Collections.emptyList();

        /* renamed from: B, reason: collision with root package name */
        private List f43601B = Collections.emptyList();

        /* renamed from: C, reason: collision with root package name */
        private List f43602C = Collections.emptyList();

        /* renamed from: D, reason: collision with root package name */
        private List f43603D = Collections.emptyList();

        /* renamed from: E, reason: collision with root package name */
        private List f43604E = Collections.emptyList();

        /* renamed from: F, reason: collision with root package name */
        private List f43605F = Collections.emptyList();

        /* renamed from: G, reason: collision with root package name */
        private List f43606G = Collections.emptyList();

        /* renamed from: H, reason: collision with root package name */
        private C6755v f43607H = C6755v.r();

        private b() {
            A();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b q() {
            return new b();
        }

        private void r() {
            if ((this.f43608s & 256) != 256) {
                this.f43601B = new ArrayList(this.f43601B);
                this.f43608s |= 256;
            }
        }

        private void s() {
            if ((this.f43608s & 8) != 8) {
                this.f43612w = new ArrayList(this.f43612w);
                this.f43608s |= 8;
            }
        }

        private void u() {
            if ((this.f43608s & 16) != 16) {
                this.f43613x = new ArrayList(this.f43613x);
                this.f43608s |= 16;
            }
        }

        private void v() {
            if ((this.f43608s & 512) != 512) {
                this.f43602C = new ArrayList(this.f43602C);
                this.f43608s |= 512;
            }
        }

        private void w() {
            if ((this.f43608s & 4096) != 4096) {
                this.f43605F = new ArrayList(this.f43605F);
                this.f43608s |= 4096;
            }
        }

        private void x() {
            if ((this.f43608s & 8192) != 8192) {
                this.f43606G = new ArrayList(this.f43606G);
                this.f43608s |= 8192;
            }
        }

        private void y() {
            if ((this.f43608s & 1024) != 1024) {
                this.f43603D = new ArrayList(this.f43603D);
                this.f43608s |= 1024;
            }
        }

        private void z() {
            if ((this.f43608s & 2048) != 2048) {
                this.f43604E = new ArrayList(this.f43604E);
                this.f43608s |= 2048;
            }
        }

        public b B(C6755v c6755v) {
            if ((this.f43608s & 16384) != 16384 || this.f43607H == C6755v.r()) {
                this.f43607H = c6755v;
            } else {
                this.f43607H = C6755v.A(this.f43607H).s(c6755v).m();
            }
            this.f43608s |= 16384;
            return this;
        }

        public b C(C6754u c6754u) {
            if (c6754u == C6754u.J()) {
                return this;
            }
            if (c6754u.c0()) {
                this.f43608s |= 1;
                this.f43609t = c6754u.f43594u;
            }
            if (c6754u.b0()) {
                this.f43608s |= 2;
                this.f43610u = c6754u.f43595v;
            }
            if (c6754u.Y()) {
                E(c6754u.M());
            }
            if (!c6754u.f43597x.isEmpty()) {
                if (this.f43612w.isEmpty()) {
                    this.f43612w = c6754u.f43597x;
                    this.f43608s &= -9;
                } else {
                    s();
                    this.f43612w.addAll(c6754u.f43597x);
                }
            }
            if (!c6754u.f43598y.isEmpty()) {
                if (this.f43613x.isEmpty()) {
                    this.f43613x = c6754u.f43598y;
                    this.f43608s &= -17;
                } else {
                    u();
                    this.f43613x.addAll(c6754u.f43598y);
                }
            }
            if (c6754u.X()) {
                D(c6754u.L());
            }
            if (c6754u.a0()) {
                G(c6754u.T());
            }
            if (c6754u.Z()) {
                F(c6754u.S());
            }
            if (!c6754u.f43583C.isEmpty()) {
                if (this.f43601B.isEmpty()) {
                    this.f43601B = c6754u.f43583C;
                    this.f43608s &= -257;
                } else {
                    r();
                    this.f43601B.addAll(c6754u.f43583C);
                }
            }
            if (!c6754u.f43584D.isEmpty()) {
                if (this.f43602C.isEmpty()) {
                    this.f43602C = c6754u.f43584D;
                    this.f43608s &= -513;
                } else {
                    v();
                    this.f43602C.addAll(c6754u.f43584D);
                }
            }
            if (!c6754u.f43585E.isEmpty()) {
                if (this.f43603D.isEmpty()) {
                    this.f43603D = c6754u.f43585E;
                    this.f43608s &= -1025;
                } else {
                    y();
                    this.f43603D.addAll(c6754u.f43585E);
                }
            }
            if (!c6754u.f43586F.isEmpty()) {
                if (this.f43604E.isEmpty()) {
                    this.f43604E = c6754u.f43586F;
                    this.f43608s &= -2049;
                } else {
                    z();
                    this.f43604E.addAll(c6754u.f43586F);
                }
            }
            if (!c6754u.f43587G.isEmpty()) {
                if (this.f43605F.isEmpty()) {
                    this.f43605F = c6754u.f43587G;
                    this.f43608s &= -4097;
                } else {
                    w();
                    this.f43605F.addAll(c6754u.f43587G);
                }
            }
            if (!c6754u.f43588H.isEmpty()) {
                if (this.f43606G.isEmpty()) {
                    this.f43606G = c6754u.f43588H;
                    this.f43608s &= -8193;
                } else {
                    x();
                    this.f43606G.addAll(c6754u.f43588H);
                }
            }
            if (c6754u.W()) {
                B(c6754u.K());
            }
            k(i().c(c6754u.f43592s));
            return this;
        }

        public b D(boolean z7) {
            this.f43608s |= 32;
            this.f43614y = z7;
            return this;
        }

        public b E(long j8) {
            this.f43608s |= 4;
            this.f43611v = j8;
            return this;
        }

        public b F(boolean z7) {
            this.f43608s |= 128;
            this.f43600A = z7;
            return this;
        }

        public b G(boolean z7) {
            this.f43608s |= 64;
            this.f43615z = z7;
            return this;
        }

        public C6754u m() {
            C6754u c6754u = new C6754u(this);
            int i8 = this.f43608s;
            int i9 = (i8 & 1) != 1 ? 0 : 1;
            c6754u.f43594u = this.f43609t;
            if ((i8 & 2) == 2) {
                i9 |= 2;
            }
            c6754u.f43595v = this.f43610u;
            if ((i8 & 4) == 4) {
                i9 |= 4;
            }
            c6754u.f43596w = this.f43611v;
            if ((this.f43608s & 8) == 8) {
                this.f43612w = DesugarCollections.unmodifiableList(this.f43612w);
                this.f43608s &= -9;
            }
            c6754u.f43597x = this.f43612w;
            if ((this.f43608s & 16) == 16) {
                this.f43613x = DesugarCollections.unmodifiableList(this.f43613x);
                this.f43608s &= -17;
            }
            c6754u.f43598y = this.f43613x;
            if ((i8 & 32) == 32) {
                i9 |= 8;
            }
            c6754u.f43599z = this.f43614y;
            if ((i8 & 64) == 64) {
                i9 |= 16;
            }
            c6754u.f43581A = this.f43615z;
            if ((i8 & 128) == 128) {
                i9 |= 32;
            }
            c6754u.f43582B = this.f43600A;
            if ((this.f43608s & 256) == 256) {
                this.f43601B = DesugarCollections.unmodifiableList(this.f43601B);
                this.f43608s &= -257;
            }
            c6754u.f43583C = this.f43601B;
            if ((this.f43608s & 512) == 512) {
                this.f43602C = DesugarCollections.unmodifiableList(this.f43602C);
                this.f43608s &= -513;
            }
            c6754u.f43584D = this.f43602C;
            if ((this.f43608s & 1024) == 1024) {
                this.f43603D = DesugarCollections.unmodifiableList(this.f43603D);
                this.f43608s &= -1025;
            }
            c6754u.f43585E = this.f43603D;
            if ((this.f43608s & 2048) == 2048) {
                this.f43604E = DesugarCollections.unmodifiableList(this.f43604E);
                this.f43608s &= -2049;
            }
            c6754u.f43586F = this.f43604E;
            if ((this.f43608s & 4096) == 4096) {
                this.f43605F = DesugarCollections.unmodifiableList(this.f43605F);
                this.f43608s &= -4097;
            }
            c6754u.f43587G = this.f43605F;
            if ((this.f43608s & 8192) == 8192) {
                this.f43606G = DesugarCollections.unmodifiableList(this.f43606G);
                this.f43608s &= -8193;
            }
            c6754u.f43588H = this.f43606G;
            if ((i8 & 16384) == 16384) {
                i9 |= 64;
            }
            c6754u.f43589I = this.f43607H;
            c6754u.f43593t = i9;
            return c6754u;
        }

        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return q().C(m());
        }

        private void A() {
        }
    }
}
