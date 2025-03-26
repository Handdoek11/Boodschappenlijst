package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzpi extends Exception {

    /* renamed from: o, reason: collision with root package name */
    public final int f28775o;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f28776s;

    public zzpi(int i8, int i9, int i10, int i11, D d8, boolean z7, Exception exc) {
        String valueOf = String.valueOf(d8);
        StringBuilder sb = new StringBuilder();
        sb.append("AudioTrack init failed ");
        sb.append(i8);
        sb.append(" Config(");
        sb.append(i9);
        sb.append(", ");
        sb.append(i10);
        sb.append(", ");
        sb.append(i11);
        sb.append(") ");
        sb.append(valueOf);
        sb.append(true != z7 ? "" : " (recoverable)");
        super(sb.toString(), exc);
        this.f28775o = i8;
        this.f28776s = z7;
    }
}
