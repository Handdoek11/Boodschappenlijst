package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: com.google.android.gms.internal.ads.d70, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2373d70 {

    /* renamed from: a, reason: collision with root package name */
    private final Pattern f21430a;

    public C2373d70() {
        Pattern pattern;
        try {
            pattern = Pattern.compile((String) D2.A.c().a(AbstractC3184kf.f23693H6));
        } catch (PatternSyntaxException unused) {
            pattern = null;
        }
        this.f21430a = pattern;
    }

    public final String a(String str) {
        Pattern pattern = this.f21430a;
        if (pattern == null || str == null) {
            return null;
        }
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }
}
