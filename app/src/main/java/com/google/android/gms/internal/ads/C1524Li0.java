package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.Li0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1524Li0 implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    private final Pattern f16872a;

    public C1524Li0(Pattern pattern) {
        pattern.getClass();
        this.f16872a = pattern;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return this.f16872a.matcher(str).matches();
    }
}
