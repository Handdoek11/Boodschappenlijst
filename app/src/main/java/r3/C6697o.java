package r3;

import java.util.Arrays;

/* renamed from: r3.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6697o {

    /* renamed from: a, reason: collision with root package name */
    Object[] f42583a = new Object[8];

    /* renamed from: b, reason: collision with root package name */
    int f42584b = 0;

    /* renamed from: c, reason: collision with root package name */
    C6696n f42585c;

    public final C6697o a(Object obj, Object obj2) {
        int i8 = this.f42584b + 1;
        Object[] objArr = this.f42583a;
        int length = objArr.length;
        int i9 = i8 + i8;
        if (i9 > length) {
            this.f42583a = Arrays.copyOf(objArr, AbstractC6691i.a(length, i9));
        }
        AbstractC6688f.a(obj, obj2);
        Object[] objArr2 = this.f42583a;
        int i10 = this.f42584b;
        int i11 = i10 + i10;
        objArr2[i11] = obj;
        objArr2[i11 + 1] = obj2;
        this.f42584b = i10 + 1;
        return this;
    }

    public final AbstractC6698p b() {
        C6696n c6696n = this.f42585c;
        if (c6696n != null) {
            throw c6696n.a();
        }
        x h8 = x.h(this.f42584b, this.f42583a, this);
        C6696n c6696n2 = this.f42585c;
        if (c6696n2 == null) {
            return h8;
        }
        throw c6696n2.a();
    }
}
