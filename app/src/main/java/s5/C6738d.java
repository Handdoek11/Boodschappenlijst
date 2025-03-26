package s5;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: s5.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6738d extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: x, reason: collision with root package name */
    private static final C6738d f43089x;

    /* renamed from: y, reason: collision with root package name */
    public static com.google.protobuf.n f43090y = new a();

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f43091s;

    /* renamed from: t, reason: collision with root package name */
    private List f43092t;

    /* renamed from: u, reason: collision with root package name */
    private int f43093u;

    /* renamed from: v, reason: collision with root package name */
    private byte f43094v;

    /* renamed from: w, reason: collision with root package name */
    private int f43095w;

    /* renamed from: s5.d$a */
    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public C6738d d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new C6738d(eVar, fVar);
        }
    }

    static {
        C6738d c6738d = new C6738d(true);
        f43089x = c6738d;
        c6738d.l();
    }

    private void l() {
        this.f43092t = Collections.emptyList();
    }

    public static C6738d m(byte[] bArr) {
        return (C6738d) f43090y.a(bArr);
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f43095w;
        if (i8 != -1) {
            return i8;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f43092t.size(); i10++) {
            i9 += CodedOutputStream.i(((Integer) this.f43092t.get(i10)).intValue());
        }
        int i11 = !k().isEmpty() ? i9 + 1 + CodedOutputStream.i(i9) : i9;
        this.f43093u = i9;
        int size = i11 + this.f43091s.size();
        this.f43095w = size;
        return size;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        byte b8 = this.f43094v;
        if (b8 == 1) {
            return true;
        }
        if (b8 == 0) {
            return false;
        }
        this.f43094v = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        if (k().size() > 0) {
            codedOutputStream.W(10);
            codedOutputStream.W(this.f43093u);
        }
        for (int i8 = 0; i8 < this.f43092t.size(); i8++) {
            codedOutputStream.L(((Integer) this.f43092t.get(i8)).intValue());
        }
        codedOutputStream.S(this.f43091s);
    }

    public int i(int i8) {
        return ((Integer) this.f43092t.get(i8)).intValue();
    }

    public int j() {
        return this.f43092t.size();
    }

    public List k() {
        return this.f43092t;
    }

    private C6738d(boolean z7) {
        this.f43093u = -1;
        this.f43094v = (byte) -1;
        this.f43095w = -1;
        this.f43091s = com.google.protobuf.d.f33078o;
    }

    private C6738d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f43093u = -1;
        this.f43094v = (byte) -1;
        this.f43095w = -1;
        l();
        d.b t7 = com.google.protobuf.d.t();
        CodedOutputStream w7 = CodedOutputStream.w(t7);
        boolean z7 = false;
        boolean z8 = false;
        while (!z7) {
            try {
                try {
                    try {
                        int x7 = eVar.x();
                        if (x7 != 0) {
                            if (x7 == 8) {
                                if (!z8) {
                                    this.f43092t = new ArrayList();
                                    z8 = true;
                                }
                                this.f43092t.add(Integer.valueOf(eVar.l()));
                            } else if (x7 != 10) {
                                if (!h(eVar, w7, fVar, x7)) {
                                }
                            } else {
                                int h8 = eVar.h(eVar.s());
                                if (!z8 && eVar.c() > 0) {
                                    this.f43092t = new ArrayList();
                                    z8 = true;
                                }
                                while (eVar.c() > 0) {
                                    this.f43092t.add(Integer.valueOf(eVar.l()));
                                }
                                eVar.g(h8);
                            }
                        }
                        z7 = true;
                    } catch (IOException e8) {
                        throw new InvalidProtocolBufferException(e8.getMessage()).g(this);
                    }
                } catch (InvalidProtocolBufferException e9) {
                    throw e9.g(this);
                }
            } catch (Throwable th) {
                if (z8) {
                    this.f43092t = DesugarCollections.unmodifiableList(this.f43092t);
                }
                try {
                    w7.v();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f43091s = t7.h();
                    throw th2;
                }
                this.f43091s = t7.h();
                g();
                throw th;
            }
        }
        if (z8) {
            this.f43092t = DesugarCollections.unmodifiableList(this.f43092t);
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f43091s = t7.h();
            throw th3;
        }
        this.f43091s = t7.h();
        g();
    }
}
