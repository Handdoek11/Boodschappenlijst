package j$.util.stream;

/* loaded from: classes3.dex */
final class O3 extends AbstractC5965k2 implements d4 {

    /* renamed from: b, reason: collision with root package name */
    long f37535b;

    /* renamed from: c, reason: collision with root package name */
    boolean f37536c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f37537d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ P3 f37538e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    O3(P3 p32, InterfaceC5985o2 interfaceC5985o2, boolean z7) {
        super(interfaceC5985o2);
        this.f37538e = p32;
        this.f37537d = z7;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    @Override // java.util.function.Consumer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void accept(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r6.f37536c
            if (r0 != 0) goto L15
            j$.util.stream.P3 r0 = r6.f37538e
            java.util.function.Predicate r0 = r0.f37549m
            boolean r0 = r0.test(r7)
            r1 = r0 ^ 1
            r6.f37536c = r1
            if (r0 != 0) goto L13
            goto L15
        L13:
            r0 = 0
            goto L16
        L15:
            r0 = 1
        L16:
            boolean r1 = r6.f37537d
            if (r1 == 0) goto L23
            if (r0 != 0) goto L23
            long r2 = r6.f37535b
            r4 = 1
            long r2 = r2 + r4
            r6.f37535b = r2
        L23:
            if (r1 != 0) goto L27
            if (r0 == 0) goto L2c
        L27:
            j$.util.stream.o2 r0 = r6.f37727a
            r0.accept(r7)
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.O3.accept(java.lang.Object):void");
    }

    @Override // j$.util.stream.d4
    public final long f() {
        return this.f37535b;
    }
}
