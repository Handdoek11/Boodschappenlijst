package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class G0 {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f15233c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f15234a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f15235b = -1;

    private final boolean c(String str) {
        Matcher matcher = f15233c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            int i8 = AbstractC2301cW.f21206a;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f15234a = parseInt;
            this.f15235b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final boolean a() {
        return (this.f15234a == -1 || this.f15235b == -1) ? false : true;
    }

    public final boolean b(C3503nb c3503nb) {
        for (int i8 = 0; i8 < c3503nb.a(); i8++) {
            InterfaceC1541Ma b8 = c3503nb.b(i8);
            if (b8 instanceof C2906i2) {
                C2906i2 c2906i2 = (C2906i2) b8;
                if ("iTunSMPB".equals(c2906i2.f22907t) && c(c2906i2.f22908u)) {
                    return true;
                }
            } else if (b8 instanceof C3884r2) {
                C3884r2 c3884r2 = (C3884r2) b8;
                if ("com.apple.iTunes".equals(c3884r2.f26055s) && "iTunSMPB".equals(c3884r2.f26056t) && c(c3884r2.f26057u)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
