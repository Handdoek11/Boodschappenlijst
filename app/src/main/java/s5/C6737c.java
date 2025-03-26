package s5;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: s5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6737c extends com.google.protobuf.g implements com.google.protobuf.m {

    /* renamed from: w, reason: collision with root package name */
    private static final C6737c f43077w;

    /* renamed from: x, reason: collision with root package name */
    public static com.google.protobuf.n f43078x = new a();

    /* renamed from: s, reason: collision with root package name */
    private final com.google.protobuf.d f43079s;

    /* renamed from: t, reason: collision with root package name */
    private List f43080t;

    /* renamed from: u, reason: collision with root package name */
    private byte f43081u;

    /* renamed from: v, reason: collision with root package name */
    private int f43082v;

    /* renamed from: s5.c$a */
    class a extends com.google.protobuf.b {
        a() {
        }

        @Override // com.google.protobuf.n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public C6737c d(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
            return new C6737c(eVar, fVar);
        }
    }

    static {
        C6737c c6737c = new C6737c(true);
        f43077w = c6737c;
        c6737c.l();
    }

    private void l() {
        this.f43080t = Collections.emptyList();
    }

    public static C6737c m(byte[] bArr) {
        return (C6737c) f43078x.a(bArr);
    }

    @Override // com.google.protobuf.l
    public int b() {
        int i8 = this.f43082v;
        if (i8 != -1) {
            return i8;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f43080t.size(); i10++) {
            i9 += CodedOutputStream.l(1, (com.google.protobuf.l) this.f43080t.get(i10));
        }
        int size = i9 + this.f43079s.size();
        this.f43082v = size;
        return size;
    }

    @Override // com.google.protobuf.m
    public final boolean c() {
        byte b8 = this.f43081u;
        if (b8 == 1) {
            return true;
        }
        if (b8 == 0) {
            return false;
        }
        for (int i8 = 0; i8 < j(); i8++) {
            if (!i(i8).c()) {
                this.f43081u = (byte) 0;
                return false;
            }
        }
        this.f43081u = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.l
    public void f(CodedOutputStream codedOutputStream) {
        b();
        for (int i8 = 0; i8 < this.f43080t.size(); i8++) {
            codedOutputStream.O(1, (com.google.protobuf.l) this.f43080t.get(i8));
        }
        codedOutputStream.S(this.f43079s);
    }

    public C6736b i(int i8) {
        return (C6736b) this.f43080t.get(i8);
    }

    public int j() {
        return this.f43080t.size();
    }

    public List k() {
        return this.f43080t;
    }

    private C6737c(boolean z7) {
        this.f43081u = (byte) -1;
        this.f43082v = -1;
        this.f43079s = com.google.protobuf.d.f33078o;
    }

    private C6737c(com.google.protobuf.e eVar, com.google.protobuf.f fVar) {
        this.f43081u = (byte) -1;
        this.f43082v = -1;
        l();
        d.b t7 = com.google.protobuf.d.t();
        CodedOutputStream w7 = CodedOutputStream.w(t7);
        boolean z7 = false;
        boolean z8 = false;
        while (!z7) {
            try {
                try {
                    int x7 = eVar.x();
                    if (x7 != 0) {
                        if (x7 != 10) {
                            if (!h(eVar, w7, fVar, x7)) {
                            }
                        } else {
                            if (!z8) {
                                this.f43080t = new ArrayList();
                                z8 = true;
                            }
                            this.f43080t.add((C6736b) eVar.n(C6736b.f43059A, fVar));
                        }
                    }
                    z7 = true;
                } catch (InvalidProtocolBufferException e8) {
                    throw e8.g(this);
                } catch (IOException e9) {
                    throw new InvalidProtocolBufferException(e9.getMessage()).g(this);
                }
            } catch (Throwable th) {
                if (z8) {
                    this.f43080t = DesugarCollections.unmodifiableList(this.f43080t);
                }
                try {
                    w7.v();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f43079s = t7.h();
                    throw th2;
                }
                this.f43079s = t7.h();
                g();
                throw th;
            }
        }
        if (z8) {
            this.f43080t = DesugarCollections.unmodifiableList(this.f43080t);
        }
        try {
            w7.v();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f43079s = t7.h();
            throw th3;
        }
        this.f43079s = t7.h();
        g();
    }
}
