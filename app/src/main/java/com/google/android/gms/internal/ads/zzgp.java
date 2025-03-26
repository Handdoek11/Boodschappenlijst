package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public class zzgp extends zzfz {

    /* renamed from: s, reason: collision with root package name */
    public final int f28764s;

    public zzgp(C4393vk0 c4393vk0, int i8, int i9) {
        super(b(2008, 1));
        this.f28764s = 1;
    }

    public static zzgp a(IOException iOException, C4393vk0 c4393vk0, int i8) {
        String message = iOException.getMessage();
        int i9 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !AbstractC4710yf0.a(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i9 == 2007 ? new zzgo(iOException, c4393vk0) : new zzgp(iOException, c4393vk0, i9, i8);
    }

    private static int b(int i8, int i9) {
        return i8 == 2000 ? i9 != 1 ? 2000 : 2001 : i8;
    }

    public zzgp(IOException iOException, C4393vk0 c4393vk0, int i8, int i9) {
        super(iOException, b(i8, i9));
        this.f28764s = i9;
    }

    public zzgp(String str, C4393vk0 c4393vk0, int i8, int i9) {
        super(str, b(i8, i9));
        this.f28764s = i9;
    }

    public zzgp(String str, IOException iOException, C4393vk0 c4393vk0, int i8, int i9) {
        super(str, iOException, b(i8, i9));
        this.f28764s = i9;
    }
}
