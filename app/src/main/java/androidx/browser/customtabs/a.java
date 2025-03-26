package androidx.browser.customtabs;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f7952a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f7953b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f7954c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f7955d;

    /* renamed from: androidx.browser.customtabs.a$a, reason: collision with other inner class name */
    public static final class C0138a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f7956a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f7957b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f7958c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f7959d;

        public a a() {
            return new a(this.f7956a, this.f7957b, this.f7958c, this.f7959d);
        }
    }

    a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f7952a = num;
        this.f7953b = num2;
        this.f7954c = num3;
        this.f7955d = num4;
    }

    Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f7952a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f7953b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f7954c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f7955d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
