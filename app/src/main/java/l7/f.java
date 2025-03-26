package l7;

import J6.AbstractC0650j;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f38843a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f38844b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f38845c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f38846d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f38847e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f38848f;

    /* renamed from: g, reason: collision with root package name */
    private final String f38849g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f38850h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f38851i;

    /* renamed from: j, reason: collision with root package name */
    private final String f38852j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f38853k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f38854l;

    public f(boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, String str, boolean z13, boolean z14, String str2, boolean z15, boolean z16) {
        J6.r.e(str, "prettyPrintIndent");
        J6.r.e(str2, "classDiscriminator");
        this.f38843a = z7;
        this.f38844b = z8;
        this.f38845c = z9;
        this.f38846d = z10;
        this.f38847e = z11;
        this.f38848f = z12;
        this.f38849g = str;
        this.f38850h = z13;
        this.f38851i = z14;
        this.f38852j = str2;
        this.f38853k = z15;
        this.f38854l = z16;
    }

    public final boolean a() {
        return this.f38853k;
    }

    public final boolean b() {
        return this.f38846d;
    }

    public final String c() {
        return this.f38852j;
    }

    public final boolean d() {
        return this.f38850h;
    }

    public final boolean e() {
        return this.f38843a;
    }

    public final boolean f() {
        return this.f38848f;
    }

    public final boolean g() {
        return this.f38844b;
    }

    public final boolean h() {
        return this.f38847e;
    }

    public final String i() {
        return this.f38849g;
    }

    public final boolean j() {
        return this.f38854l;
    }

    public final boolean k() {
        return this.f38851i;
    }

    public final boolean l() {
        return this.f38845c;
    }

    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f38843a + ", ignoreUnknownKeys=" + this.f38844b + ", isLenient=" + this.f38845c + ", allowStructuredMapKeys=" + this.f38846d + ", prettyPrint=" + this.f38847e + ", explicitNulls=" + this.f38848f + ", prettyPrintIndent='" + this.f38849g + "', coerceInputValues=" + this.f38850h + ", useArrayPolymorphism=" + this.f38851i + ", classDiscriminator='" + this.f38852j + "', allowSpecialFloatingPointValues=" + this.f38853k + ')';
    }

    public /* synthetic */ f(boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, String str, boolean z13, boolean z14, String str2, boolean z15, boolean z16, int i8, AbstractC0650j abstractC0650j) {
        this((i8 & 1) != 0 ? false : z7, (i8 & 2) != 0 ? false : z8, (i8 & 4) != 0 ? false : z9, (i8 & 8) != 0 ? false : z10, (i8 & 16) != 0 ? false : z11, (i8 & 32) != 0 ? true : z12, (i8 & 64) != 0 ? "    " : str, (i8 & 128) != 0 ? false : z13, (i8 & 256) != 0 ? false : z14, (i8 & 512) != 0 ? "type" : str2, (i8 & 1024) == 0 ? z15 : false, (i8 & 2048) == 0 ? z16 : true);
    }
}
