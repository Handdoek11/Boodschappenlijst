package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class JH0 {

    /* renamed from: d, reason: collision with root package name */
    public static final JH0 f16220d = new JH0(new C4614xm[0]);

    /* renamed from: a, reason: collision with root package name */
    public final int f16221a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC4169th0 f16222b;

    /* renamed from: c, reason: collision with root package name */
    private int f16223c;

    static {
        Integer.toString(0, 36);
    }

    public JH0(C4614xm... c4614xmArr) {
        this.f16222b = AbstractC4169th0.v(c4614xmArr);
        this.f16221a = c4614xmArr.length;
        int i8 = 0;
        while (i8 < this.f16222b.size()) {
            int i9 = i8 + 1;
            for (int i10 = i9; i10 < this.f16222b.size(); i10++) {
                if (((C4614xm) this.f16222b.get(i8)).equals(this.f16222b.get(i10))) {
                    HL.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i8 = i9;
        }
    }

    public final int a(C4614xm c4614xm) {
        int indexOf = this.f16222b.indexOf(c4614xm);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final C4614xm b(int i8) {
        return (C4614xm) this.f16222b.get(i8);
    }

    public final AbstractC4169th0 c() {
        return AbstractC4169th0.t(AbstractC1487Kh0.b(this.f16222b, new InterfaceC1376Hf0() { // from class: com.google.android.gms.internal.ads.IH0
            @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
            public final Object apply(Object obj) {
                JH0 jh0 = JH0.f16220d;
                return Integer.valueOf(((C4614xm) obj).f27904c);
            }
        }));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && JH0.class == obj.getClass()) {
            JH0 jh0 = (JH0) obj;
            if (this.f16221a == jh0.f16221a && this.f16222b.equals(jh0.f16222b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i8 = this.f16223c;
        if (i8 != 0) {
            return i8;
        }
        int hashCode = this.f16222b.hashCode();
        this.f16223c = hashCode;
        return hashCode;
    }
}
