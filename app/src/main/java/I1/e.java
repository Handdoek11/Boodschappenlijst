package I1;

import I1.a;
import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e implements a {

    /* renamed from: u, reason: collision with root package name */
    private static final String f3124u = "e";

    /* renamed from: a, reason: collision with root package name */
    private int[] f3125a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f3126b;

    /* renamed from: c, reason: collision with root package name */
    private final a.InterfaceC0054a f3127c;

    /* renamed from: d, reason: collision with root package name */
    private ByteBuffer f3128d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f3129e;

    /* renamed from: f, reason: collision with root package name */
    private short[] f3130f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f3131g;

    /* renamed from: h, reason: collision with root package name */
    private byte[] f3132h;

    /* renamed from: i, reason: collision with root package name */
    private byte[] f3133i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f3134j;

    /* renamed from: k, reason: collision with root package name */
    private int f3135k;

    /* renamed from: l, reason: collision with root package name */
    private c f3136l;

    /* renamed from: m, reason: collision with root package name */
    private Bitmap f3137m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f3138n;

    /* renamed from: o, reason: collision with root package name */
    private int f3139o;

    /* renamed from: p, reason: collision with root package name */
    private int f3140p;

    /* renamed from: q, reason: collision with root package name */
    private int f3141q;

    /* renamed from: r, reason: collision with root package name */
    private int f3142r;

    /* renamed from: s, reason: collision with root package name */
    private Boolean f3143s;

    /* renamed from: t, reason: collision with root package name */
    private Bitmap.Config f3144t;

    public e(a.InterfaceC0054a interfaceC0054a, c cVar, ByteBuffer byteBuffer, int i8) {
        this(interfaceC0054a);
        q(cVar, byteBuffer, i8);
    }

    private int i(int i8, int i9, int i10) {
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = i8; i16 < this.f3140p + i8; i16++) {
            byte[] bArr = this.f3133i;
            if (i16 >= bArr.length || i16 >= i9) {
                break;
            }
            int i17 = this.f3125a[bArr[i16] & 255];
            if (i17 != 0) {
                i11 += (i17 >> 24) & 255;
                i12 += (i17 >> 16) & 255;
                i13 += (i17 >> 8) & 255;
                i14 += i17 & 255;
                i15++;
            }
        }
        int i18 = i8 + i10;
        for (int i19 = i18; i19 < this.f3140p + i18; i19++) {
            byte[] bArr2 = this.f3133i;
            if (i19 >= bArr2.length || i19 >= i9) {
                break;
            }
            int i20 = this.f3125a[bArr2[i19] & 255];
            if (i20 != 0) {
                i11 += (i20 >> 24) & 255;
                i12 += (i20 >> 16) & 255;
                i13 += (i20 >> 8) & 255;
                i14 += i20 & 255;
                i15++;
            }
        }
        if (i15 == 0) {
            return 0;
        }
        return ((i11 / i15) << 24) | ((i12 / i15) << 16) | ((i13 / i15) << 8) | (i14 / i15);
    }

    private void j(b bVar) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int[] iArr = this.f3134j;
        int i13 = bVar.f3099d;
        int i14 = this.f3140p;
        int i15 = i13 / i14;
        int i16 = bVar.f3097b / i14;
        int i17 = bVar.f3098c / i14;
        int i18 = bVar.f3096a / i14;
        boolean z7 = this.f3135k == 0;
        int i19 = this.f3142r;
        int i20 = this.f3141q;
        byte[] bArr = this.f3133i;
        int[] iArr2 = this.f3125a;
        Boolean bool = this.f3143s;
        int i21 = 8;
        int i22 = 0;
        int i23 = 0;
        int i24 = 1;
        while (i23 < i15) {
            Boolean bool2 = bool;
            if (bVar.f3100e) {
                if (i22 >= i15) {
                    int i25 = i24 + 1;
                    i8 = i15;
                    if (i25 == 2) {
                        i22 = 4;
                    } else if (i25 == 3) {
                        i21 = 4;
                        i24 = i25;
                        i22 = 2;
                    } else if (i25 == 4) {
                        i24 = i25;
                        i22 = 1;
                        i21 = 2;
                    }
                    i24 = i25;
                } else {
                    i8 = i15;
                }
                i9 = i22 + i21;
            } else {
                i8 = i15;
                i9 = i22;
                i22 = i23;
            }
            int i26 = i22 + i16;
            boolean z8 = i14 == 1;
            if (i26 < i20) {
                int i27 = i26 * i19;
                int i28 = i27 + i18;
                int i29 = i28 + i17;
                int i30 = i27 + i19;
                if (i30 < i29) {
                    i29 = i30;
                }
                i10 = i9;
                int i31 = i23 * i14 * bVar.f3098c;
                if (z8) {
                    int i32 = i28;
                    while (i32 < i29) {
                        int i33 = i16;
                        int i34 = iArr2[bArr[i31] & 255];
                        if (i34 != 0) {
                            iArr[i32] = i34;
                        } else if (z7 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i31 += i14;
                        i32++;
                        i16 = i33;
                    }
                } else {
                    i12 = i16;
                    int i35 = ((i29 - i28) * i14) + i31;
                    int i36 = i28;
                    while (true) {
                        i11 = i17;
                        if (i36 >= i29) {
                            break;
                        }
                        int i37 = i(i31, i35, bVar.f3098c);
                        if (i37 != 0) {
                            iArr[i36] = i37;
                        } else if (z7 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i31 += i14;
                        i36++;
                        i17 = i11;
                    }
                    bool = bool2;
                    i23++;
                    i16 = i12;
                    i15 = i8;
                    i17 = i11;
                    i22 = i10;
                }
            } else {
                i10 = i9;
            }
            i12 = i16;
            i11 = i17;
            bool = bool2;
            i23++;
            i16 = i12;
            i15 = i8;
            i17 = i11;
            i22 = i10;
        }
        Boolean bool3 = bool;
        if (this.f3143s == null) {
            this.f3143s = Boolean.valueOf(bool3 == null ? false : bool3.booleanValue());
        }
    }

    private void k(b bVar) {
        b bVar2 = bVar;
        int[] iArr = this.f3134j;
        int i8 = bVar2.f3099d;
        int i9 = bVar2.f3097b;
        int i10 = bVar2.f3098c;
        int i11 = bVar2.f3096a;
        boolean z7 = this.f3135k == 0;
        int i12 = this.f3142r;
        byte[] bArr = this.f3133i;
        int[] iArr2 = this.f3125a;
        int i13 = 0;
        byte b8 = -1;
        while (i13 < i8) {
            int i14 = (i13 + i9) * i12;
            int i15 = i14 + i11;
            int i16 = i15 + i10;
            int i17 = i14 + i12;
            if (i17 < i16) {
                i16 = i17;
            }
            int i18 = bVar2.f3098c * i13;
            int i19 = i15;
            while (i19 < i16) {
                byte b9 = bArr[i18];
                int i20 = i8;
                int i21 = b9 & 255;
                if (i21 != b8) {
                    int i22 = iArr2[i21];
                    if (i22 != 0) {
                        iArr[i19] = i22;
                    } else {
                        b8 = b9;
                    }
                }
                i18++;
                i19++;
                i8 = i20;
            }
            i13++;
            bVar2 = bVar;
        }
        Boolean bool = this.f3143s;
        this.f3143s = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f3143s == null && z7 && b8 != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v15, types: [short] */
    /* JADX WARN: Type inference failed for: r7v17 */
    private void l(b bVar) {
        int i8;
        int i9;
        short s8;
        e eVar = this;
        if (bVar != null) {
            eVar.f3128d.position(bVar.f3105j);
        }
        if (bVar == null) {
            c cVar = eVar.f3136l;
            i8 = cVar.f3112f;
            i9 = cVar.f3113g;
        } else {
            i8 = bVar.f3098c;
            i9 = bVar.f3099d;
        }
        int i10 = i8 * i9;
        byte[] bArr = eVar.f3133i;
        if (bArr == null || bArr.length < i10) {
            eVar.f3133i = eVar.f3127c.e(i10);
        }
        byte[] bArr2 = eVar.f3133i;
        if (eVar.f3130f == null) {
            eVar.f3130f = new short[4096];
        }
        short[] sArr = eVar.f3130f;
        if (eVar.f3131g == null) {
            eVar.f3131g = new byte[4096];
        }
        byte[] bArr3 = eVar.f3131g;
        if (eVar.f3132h == null) {
            eVar.f3132h = new byte[4097];
        }
        byte[] bArr4 = eVar.f3132h;
        int p8 = p();
        int i11 = 1 << p8;
        int i12 = i11 + 1;
        int i13 = i11 + 2;
        int i14 = p8 + 1;
        int i15 = (1 << i14) - 1;
        int i16 = 0;
        for (int i17 = 0; i17 < i11; i17++) {
            sArr[i17] = 0;
            bArr3[i17] = (byte) i17;
        }
        byte[] bArr5 = eVar.f3129e;
        int i18 = i14;
        int i19 = i13;
        int i20 = i15;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = -1;
        while (true) {
            if (i16 >= i10) {
                break;
            }
            if (i21 == 0) {
                i21 = o();
                if (i21 <= 0) {
                    eVar.f3139o = 3;
                    break;
                }
                i22 = 0;
            }
            i24 += (bArr5[i22] & 255) << i23;
            i22++;
            i21--;
            int i29 = i23 + 8;
            int i30 = i19;
            int i31 = i18;
            int i32 = i28;
            int i33 = i14;
            int i34 = i26;
            while (true) {
                if (i29 < i31) {
                    i28 = i32;
                    i19 = i30;
                    i23 = i29;
                    eVar = this;
                    i26 = i34;
                    i14 = i33;
                    i18 = i31;
                    break;
                }
                int i35 = i13;
                int i36 = i24 & i20;
                i24 >>= i31;
                i29 -= i31;
                if (i36 == i11) {
                    i20 = i15;
                    i31 = i33;
                    i30 = i35;
                    i13 = i30;
                    i32 = -1;
                } else {
                    if (i36 == i12) {
                        i23 = i29;
                        i26 = i34;
                        i19 = i30;
                        i14 = i33;
                        i13 = i35;
                        i28 = i32;
                        i18 = i31;
                        eVar = this;
                        break;
                    }
                    if (i32 == -1) {
                        bArr2[i25] = bArr3[i36];
                        i25++;
                        i16++;
                        i32 = i36;
                        i34 = i32;
                        i13 = i35;
                        i29 = i29;
                    } else {
                        if (i36 >= i30) {
                            bArr4[i27] = (byte) i34;
                            i27++;
                            s8 = i32;
                        } else {
                            s8 = i36;
                        }
                        while (s8 >= i11) {
                            bArr4[i27] = bArr3[s8];
                            i27++;
                            s8 = sArr[s8];
                        }
                        i34 = bArr3[s8] & 255;
                        byte b8 = (byte) i34;
                        bArr2[i25] = b8;
                        while (true) {
                            i25++;
                            i16++;
                            if (i27 <= 0) {
                                break;
                            }
                            i27--;
                            bArr2[i25] = bArr4[i27];
                        }
                        byte[] bArr6 = bArr4;
                        if (i30 < 4096) {
                            sArr[i30] = (short) i32;
                            bArr3[i30] = b8;
                            i30++;
                            if ((i30 & i20) == 0 && i30 < 4096) {
                                i31++;
                                i20 += i30;
                            }
                        }
                        i32 = i36;
                        i13 = i35;
                        i29 = i29;
                        bArr4 = bArr6;
                    }
                }
            }
        }
        Arrays.fill(bArr2, i25, i10, (byte) 0);
    }

    private Bitmap n() {
        Boolean bool = this.f3143s;
        Bitmap a8 = this.f3127c.a(this.f3142r, this.f3141q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f3144t);
        a8.setHasAlpha(true);
        return a8;
    }

    private int o() {
        int p8 = p();
        if (p8 <= 0) {
            return p8;
        }
        ByteBuffer byteBuffer = this.f3128d;
        byteBuffer.get(this.f3129e, 0, Math.min(p8, byteBuffer.remaining()));
        return p8;
    }

    private int p() {
        return this.f3128d.get() & 255;
    }

    private Bitmap r(b bVar, b bVar2) {
        int i8;
        int i9;
        Bitmap bitmap;
        int[] iArr = this.f3134j;
        int i10 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f3137m;
            if (bitmap2 != null) {
                this.f3127c.c(bitmap2);
            }
            this.f3137m = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f3102g == 3 && this.f3137m == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i9 = bVar2.f3102g) > 0) {
            if (i9 == 2) {
                if (!bVar.f3101f) {
                    c cVar = this.f3136l;
                    int i11 = cVar.f3118l;
                    if (bVar.f3106k == null || cVar.f3116j != bVar.f3103h) {
                        i10 = i11;
                    }
                }
                int i12 = bVar2.f3099d;
                int i13 = this.f3140p;
                int i14 = i12 / i13;
                int i15 = bVar2.f3097b / i13;
                int i16 = bVar2.f3098c / i13;
                int i17 = bVar2.f3096a / i13;
                int i18 = this.f3142r;
                int i19 = (i15 * i18) + i17;
                int i20 = (i14 * i18) + i19;
                while (i19 < i20) {
                    int i21 = i19 + i16;
                    for (int i22 = i19; i22 < i21; i22++) {
                        iArr[i22] = i10;
                    }
                    i19 += this.f3142r;
                }
            } else if (i9 == 3 && (bitmap = this.f3137m) != null) {
                int i23 = this.f3142r;
                bitmap.getPixels(iArr, 0, i23, 0, 0, i23, this.f3141q);
            }
        }
        l(bVar);
        if (bVar.f3100e || this.f3140p != 1) {
            j(bVar);
        } else {
            k(bVar);
        }
        if (this.f3138n && ((i8 = bVar.f3102g) == 0 || i8 == 1)) {
            if (this.f3137m == null) {
                this.f3137m = n();
            }
            Bitmap bitmap3 = this.f3137m;
            int i24 = this.f3142r;
            bitmap3.setPixels(iArr, 0, i24, 0, 0, i24, this.f3141q);
        }
        Bitmap n8 = n();
        int i25 = this.f3142r;
        n8.setPixels(iArr, 0, i25, 0, 0, i25, this.f3141q);
        return n8;
    }

    @Override // I1.a
    public synchronized Bitmap a() {
        try {
            if (this.f3136l.f3109c <= 0 || this.f3135k < 0) {
                String str = f3124u;
                if (Log.isLoggable(str, 3)) {
                    Log.d(str, "Unable to decode frame, frameCount=" + this.f3136l.f3109c + ", framePointer=" + this.f3135k);
                }
                this.f3139o = 1;
            }
            int i8 = this.f3139o;
            if (i8 != 1 && i8 != 2) {
                this.f3139o = 0;
                if (this.f3129e == null) {
                    this.f3129e = this.f3127c.e(255);
                }
                b bVar = (b) this.f3136l.f3111e.get(this.f3135k);
                int i9 = this.f3135k - 1;
                b bVar2 = i9 >= 0 ? (b) this.f3136l.f3111e.get(i9) : null;
                int[] iArr = bVar.f3106k;
                if (iArr == null) {
                    iArr = this.f3136l.f3107a;
                }
                this.f3125a = iArr;
                if (iArr == null) {
                    String str2 = f3124u;
                    if (Log.isLoggable(str2, 3)) {
                        Log.d(str2, "No valid color table found for frame #" + this.f3135k);
                    }
                    this.f3139o = 1;
                    return null;
                }
                if (bVar.f3101f) {
                    System.arraycopy(iArr, 0, this.f3126b, 0, iArr.length);
                    int[] iArr2 = this.f3126b;
                    this.f3125a = iArr2;
                    iArr2[bVar.f3103h] = 0;
                    if (bVar.f3102g == 2 && this.f3135k == 0) {
                        this.f3143s = Boolean.TRUE;
                    }
                }
                return r(bVar, bVar2);
            }
            String str3 = f3124u;
            if (Log.isLoggable(str3, 3)) {
                Log.d(str3, "Unable to decode frame, status=" + this.f3139o);
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // I1.a
    public void b() {
        this.f3135k = (this.f3135k + 1) % this.f3136l.f3109c;
    }

    @Override // I1.a
    public int c() {
        return this.f3136l.f3109c;
    }

    @Override // I1.a
    public void clear() {
        this.f3136l = null;
        byte[] bArr = this.f3133i;
        if (bArr != null) {
            this.f3127c.d(bArr);
        }
        int[] iArr = this.f3134j;
        if (iArr != null) {
            this.f3127c.f(iArr);
        }
        Bitmap bitmap = this.f3137m;
        if (bitmap != null) {
            this.f3127c.c(bitmap);
        }
        this.f3137m = null;
        this.f3128d = null;
        this.f3143s = null;
        byte[] bArr2 = this.f3129e;
        if (bArr2 != null) {
            this.f3127c.d(bArr2);
        }
    }

    @Override // I1.a
    public int d() {
        int i8;
        if (this.f3136l.f3109c <= 0 || (i8 = this.f3135k) < 0) {
            return 0;
        }
        return m(i8);
    }

    @Override // I1.a
    public void e(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f3144t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    @Override // I1.a
    public void f() {
        this.f3135k = -1;
    }

    @Override // I1.a
    public int g() {
        return this.f3135k;
    }

    @Override // I1.a
    public ByteBuffer getData() {
        return this.f3128d;
    }

    @Override // I1.a
    public int h() {
        return this.f3128d.limit() + this.f3133i.length + (this.f3134j.length * 4);
    }

    public int m(int i8) {
        if (i8 >= 0) {
            c cVar = this.f3136l;
            if (i8 < cVar.f3109c) {
                return ((b) cVar.f3111e.get(i8)).f3104i;
            }
        }
        return -1;
    }

    public synchronized void q(c cVar, ByteBuffer byteBuffer, int i8) {
        try {
            if (i8 <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i8);
            }
            int highestOneBit = Integer.highestOneBit(i8);
            this.f3139o = 0;
            this.f3136l = cVar;
            this.f3135k = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f3128d = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f3128d.order(ByteOrder.LITTLE_ENDIAN);
            this.f3138n = false;
            Iterator it = cVar.f3111e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((b) it.next()).f3102g == 3) {
                    this.f3138n = true;
                    break;
                }
            }
            this.f3140p = highestOneBit;
            int i9 = cVar.f3112f;
            this.f3142r = i9 / highestOneBit;
            int i10 = cVar.f3113g;
            this.f3141q = i10 / highestOneBit;
            this.f3133i = this.f3127c.e(i9 * i10);
            this.f3134j = this.f3127c.b(this.f3142r * this.f3141q);
        } catch (Throwable th) {
            throw th;
        }
    }

    public e(a.InterfaceC0054a interfaceC0054a) {
        this.f3126b = new int[256];
        this.f3144t = Bitmap.Config.ARGB_8888;
        this.f3127c = interfaceC0054a;
        this.f3136l = new c();
    }
}
