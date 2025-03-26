package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.Gs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1357Gs extends AbstractC1141As implements Wu0 {

    /* renamed from: F, reason: collision with root package name */
    private static final AtomicInteger f15450F = new AtomicInteger(0);

    /* renamed from: A, reason: collision with root package name */
    private boolean f15451A;

    /* renamed from: B, reason: collision with root package name */
    private final Object f15452B;

    /* renamed from: C, reason: collision with root package name */
    private final String f15453C;

    /* renamed from: D, reason: collision with root package name */
    private final int f15454D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f15455E;

    /* renamed from: u, reason: collision with root package name */
    private String f15456u;

    /* renamed from: v, reason: collision with root package name */
    private final Lr f15457v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f15458w;

    /* renamed from: x, reason: collision with root package name */
    private final C1321Fs f15459x;

    /* renamed from: y, reason: collision with root package name */
    private final C3101js f15460y;

    /* renamed from: z, reason: collision with root package name */
    private ByteBuffer f15461z;

    public C1357Gs(InterfaceC1567Mr interfaceC1567Mr, Lr lr) {
        super(interfaceC1567Mr);
        this.f15457v = lr;
        this.f15459x = new C1321Fs();
        this.f15460y = new C3101js();
        this.f15452B = new Object();
        this.f15453C = (String) AbstractC1692Qf0.d(interfaceC1567Mr != null ? interfaceC1567Mr.r() : null).b("");
        this.f15454D = interfaceC1567Mr != null ? interfaceC1567Mr.c() : 0;
        f15450F.incrementAndGet();
    }

    public static int t() {
        return f15450F.get();
    }

    protected static final String y(String str) {
        return "cache:".concat(String.valueOf(H2.g.j(str)));
    }

    private final void z() {
        int a8 = (int) this.f15459x.a();
        int a9 = (int) this.f15460y.a(this.f15461z);
        int position = this.f15461z.position();
        int round = Math.round(a9 * (position / a8));
        int O7 = AbstractC1248Dr.O();
        int Q7 = AbstractC1248Dr.Q();
        String str = this.f15456u;
        h(str, y(str), position, a8, round, a9, round > 0, O7, Q7);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1141As
    public final void b() {
        this.f15458w = true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1141As, W2.e
    public final void d() {
        f15450F.decrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.Wu0
    public final void f(InterfaceC1344Gh0 interfaceC1344Gh0, C4393vk0 c4393vk0, boolean z7) {
    }

    @Override // com.google.android.gms.internal.ads.Wu0
    public final void i(InterfaceC1344Gh0 interfaceC1344Gh0, C4393vk0 c4393vk0, boolean z7, int i8) {
    }

    @Override // com.google.android.gms.internal.ads.Wu0
    public final void o(InterfaceC1344Gh0 interfaceC1344Gh0, C4393vk0 c4393vk0, boolean z7) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b4, code lost:
    
        r21.f15455E = true;
        g(r22, r4, (int) r21.f15460y.a(r21.f15461z));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ed, code lost:
    
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:? -> B:23:0x00d6). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.AbstractC1141As
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean p(java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1357Gs.p(java.lang.String):boolean");
    }

    @Override // com.google.android.gms.internal.ads.Wu0
    public final void q(InterfaceC1344Gh0 interfaceC1344Gh0, C4393vk0 c4393vk0, boolean z7) {
        if (interfaceC1344Gh0 instanceof Bo0) {
            this.f15459x.b((Bo0) interfaceC1344Gh0);
        }
    }

    public final String v() {
        return this.f15456u;
    }

    public final ByteBuffer w() {
        synchronized (this.f15452B) {
            try {
                ByteBuffer byteBuffer = this.f15461z;
                if (byteBuffer != null && !this.f15451A) {
                    byteBuffer.flip();
                    this.f15451A = true;
                }
                this.f15458w = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f15461z;
    }

    public final boolean x() {
        return this.f15455E;
    }
}
