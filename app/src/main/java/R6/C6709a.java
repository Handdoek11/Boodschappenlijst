package r6;

/* renamed from: r6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6709a {

    /* renamed from: a, reason: collision with root package name */
    final int f42611a;

    /* renamed from: b, reason: collision with root package name */
    final Object[] f42612b;

    /* renamed from: c, reason: collision with root package name */
    Object[] f42613c;

    /* renamed from: d, reason: collision with root package name */
    int f42614d;

    /* renamed from: r6.a$a, reason: collision with other inner class name */
    public interface InterfaceC0326a extends f6.i {
        @Override // f6.i
        boolean test(Object obj);
    }

    public C6709a(int i8) {
        this.f42611a = i8;
        Object[] objArr = new Object[i8 + 1];
        this.f42612b = objArr;
        this.f42613c = objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0019, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(a6.i r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.f42612b
            int r1 = r4.f42611a
        L4:
            r2 = 0
            if (r0 == 0) goto L1e
        L7:
            if (r2 >= r1) goto L19
            r3 = r0[r2]
            if (r3 != 0) goto Le
            goto L19
        Le:
            boolean r3 = r6.EnumC6715g.c(r3, r5)
            if (r3 == 0) goto L16
            r5 = 1
            return r5
        L16:
            int r2 = r2 + 1
            goto L7
        L19:
            r0 = r0[r1]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L4
        L1e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.C6709a.a(a6.i):boolean");
    }

    public void b(Object obj) {
        int i8 = this.f42611a;
        int i9 = this.f42614d;
        if (i9 == i8) {
            Object[] objArr = new Object[i8 + 1];
            this.f42613c[i8] = objArr;
            this.f42613c = objArr;
            i9 = 0;
        }
        this.f42613c[i9] = obj;
        this.f42614d = i9 + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0018, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(r6.C6709a.InterfaceC0326a r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.f42612b
            int r1 = r4.f42611a
        L4:
            if (r0 == 0) goto L1d
            r2 = 0
        L7:
            if (r2 >= r1) goto L18
            r3 = r0[r2]
            if (r3 != 0) goto Le
            goto L18
        Le:
            boolean r3 = r5.test(r3)
            if (r3 == 0) goto L15
            return
        L15:
            int r2 = r2 + 1
            goto L7
        L18:
            r0 = r0[r1]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L4
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.C6709a.c(r6.a$a):void");
    }

    public void d(Object obj) {
        this.f42612b[0] = obj;
    }
}
