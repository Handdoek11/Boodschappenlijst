package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.uo0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4292uo0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f27102a = Logger.getLogger(AbstractC4292uo0.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f27103b = new AtomicBoolean(false);

    static Boolean a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        } catch (Exception unused) {
            f27102a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    public static boolean b() {
        return f27103b.get();
    }
}
