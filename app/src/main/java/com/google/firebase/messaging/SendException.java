package com.google.firebase.messaging;

import java.util.Locale;

/* loaded from: classes2.dex */
public final class SendException extends Exception {

    /* renamed from: o, reason: collision with root package name */
    private final int f32888o;

    SendException(String str) {
        super(str);
        this.f32888o = a(str);
    }

    private int a(String str) {
        if (str == null) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        lowerCase.hashCode();
        switch (lowerCase) {
        }
        return 0;
    }
}
