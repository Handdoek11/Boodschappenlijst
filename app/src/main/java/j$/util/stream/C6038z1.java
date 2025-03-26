package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* renamed from: j$.util.stream.z1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C6038z1 extends CountedCompleter {

    /* renamed from: a, reason: collision with root package name */
    protected final K0 f37846a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f37847b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f37848c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f37849d;

    public C6038z1(K0 k02, Object obj, int i8) {
        this.f37848c = i8;
        this.f37846a = k02;
        this.f37847b = 0;
        this.f37849d = obj;
    }

    C6038z1(C6038z1 c6038z1, K0 k02, int i8, byte b8) {
        super(c6038z1);
        this.f37846a = k02;
        this.f37847b = i8;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        C6038z1 c6038z1 = this;
        while (c6038z1.f37846a.q() != 0) {
            c6038z1.setPendingCount(c6038z1.f37846a.q() - 1);
            int i8 = 0;
            int i9 = 0;
            while (i8 < c6038z1.f37846a.q() - 1) {
                C6038z1 a8 = c6038z1.a(i8, c6038z1.f37847b + i9);
                i9 = (int) (i9 + a8.f37846a.count());
                a8.fork();
                i8++;
            }
            c6038z1 = c6038z1.a(i8, c6038z1.f37847b + i9);
        }
        switch (c6038z1.f37848c) {
            case 0:
                ((J0) c6038z1.f37846a).r(c6038z1.f37847b, c6038z1.f37849d);
                break;
            default:
                c6038z1.f37846a.i((Object[]) c6038z1.f37849d, c6038z1.f37847b);
                break;
        }
        c6038z1.propagateCompletion();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6038z1(C6038z1 c6038z1, K0 k02, int i8) {
        this(c6038z1, k02, i8, (byte) 0);
        this.f37848c = 1;
        this.f37849d = (Object[]) c6038z1.f37849d;
    }

    final C6038z1 a(int i8, int i9) {
        switch (this.f37848c) {
            case 0:
                return new C6038z1(this, ((J0) this.f37846a).b(i8), i9);
            default:
                return new C6038z1(this, this.f37846a.b(i8), i9);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6038z1(C6038z1 c6038z1, J0 j02, int i8) {
        this(c6038z1, j02, i8, (byte) 0);
        this.f37848c = 0;
        this.f37849d = c6038z1.f37849d;
    }
}
