package com.drivewise.smarttraffic.repository;

import java.util.List;

import com.drivewise.smarttraffic.api.dto.LinkTrafficDTO;
import com.drivewise.smarttraffic.api.dto.TrafficInfoDTO;

public interface ILinkTrafficRepository {
	public void createLinkTraffics(LinkTrafficDTO dto);
	public List<TrafficInfoDTO> getResentLinkTraffics();
}
