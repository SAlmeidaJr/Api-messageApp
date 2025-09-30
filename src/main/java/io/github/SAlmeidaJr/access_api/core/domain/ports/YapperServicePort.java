package io.github.SAlmeidaJr.access_api.core.domain.ports;

import io.github.SAlmeidaJr.access_api.core.domain.Yapper;

public interface YapperServicePort {
    Yapper createUser(Yapper yapper);
}
